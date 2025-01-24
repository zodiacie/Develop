namespace testcsharpselenium;

    [TestFixture]
    public class Tests
    {
        //IWebDriver driver;
        //Define API URL
        private string getUrl = "https://openlibrary.org";
        private string getCriteria = "/search.json?title=Goodnight+Moon&q=first_publish_year:[2000+TO+2023]";
        [OneTimeSetUp]
        public void Setup()
        {
            //driver = new ChromeDriver();
        }

        [Test]
        //Test1 is for question 3.1.1 and 3.1.2
        public void Test1(){        
            //Define API call handler
            var restClient = new RestClient(getUrl);
            var restRequest = new RestRequest(getCriteria, Method.Get);
            var restResponse = restClient.Execute(restRequest);
            var restJSON = restResponse.Content;
            var parseJSON = JObject.Parse(restJSON);  

            //Define Book Counts and Key List
            var count = 0;
            String stringKey = "";  
            List<string> arrayListKey = new List<string>();
            
            //Parse API JSON data in an iteration.
            foreach(var property in parseJSON.Properties()){
                //Get API Key fieldname.
                string fieldName = property.Name;
                //When it gets Key fieldname = "docs", get array from "Key" fieldname. 
                if (fieldName == "docs"){
                    //Parse JSON arrary.
                    JArray? arrayJSON = parseJSON[fieldName] as JArray;
                    //Get each JSON object from JSON array.
                    foreach(JToken arrayElement in arrayJSON){
                        //Get each JSON Key-Value pair from JSON object
                        foreach(JToken arrayChild in arrayElement.Children()){
                            //Verify if the Key-Value pair is valid JSON string.
                            if (arrayChild is JProperty arrayProperty){
                                //Get Key fieldname from JSON Key-Value pair.
                                string arrayFieldName = arrayProperty.Name;     
                                //If Key fieldname = "Key", then save its value for future use.                      
                                if (arrayFieldName == "key"){
                                    JToken arrayFieldKey = arrayProperty.Value;                                
                                    stringKey = arrayFieldKey.Value<string>();                   
                                }
                                //If Key fieldname = "title", then retrieve its value and verify if it's exact matching "Goodnight Moon"
                                if (arrayFieldName == "title"){
                                    JToken arrayFieldValue = arrayProperty.Value;  
                                    //If Value = "Goodnight Moon", then count plus one and arrayList add book's Key value.                              
                                    if (arrayFieldValue.Value<string>() == "Goodnight Moon"){
                                        arrayListKey.Add(stringKey);
                                        count++;
                                        Console.WriteLine(count);
                                        Console.WriteLine(arrayFieldValue); 
                                        foreach(string item in arrayListKey){
                                            Console.WriteLine(item);   
                                        }                                                                        
                                    }
                                }
                            }
                        }
                    }                
                }
            }    
            if (count == 6){
                    Assert.Pass();
            }
            else {
                Assert.Fail();
            }
        
        
            /*RestClient restClient = new RestClient(getUrl);
            //var restClient = new RestClient(getUrl);
            var restRequest = new RestRequest("/search.json?title=Goodnight+Moon", Method.Get);
            var restResponse = restClient.Execute(restRequest);  
            Trace.WriteLine("Hello World");

            //Assert.AreEqual(200, (int)restResponse.StatusCode);
            if (restResponse.Content != null){
                driver.Navigate().GoToUrl("https://www.google.com");
                if (restResponse.Content.Contains("\"numFound\": 118,")){
                    Assert.Pass();
                }
                else {
                    Assert.Fail();
                }
            }   */   
        }
        [Test]
        //Test2 is for question 3.2.1
        public void Test2(){   
            //Define API Call handlers   
            var restClient = new RestClient(getUrl);
            var restRequest1 = new RestRequest("/search.json?title=Goodnight+Moon+Base", Method.Get);
            var restRequest2 = new RestRequest("/search.json?title=Goodnight+Moon+123+Lap+Edition", Method.Get);
            var restResponse1 = restClient.Execute(restRequest1);
            var restResponse2 = restClient.Execute(restRequest2);
            var restJSON1 = restResponse1.Content;
            var parseJSON1 = JObject.Parse(restJSON1); 
            var restJSON2 = restResponse2.Content;
            var parseJSON2 = JObject.Parse(restJSON2); 
            //Compare each JSON Key-Value between "Goodnight Moon Base" and "Goodnight Moon 123 Lap Edition"
            foreach (var property1 in parseJSON1.Properties()){
                var property2 = parseJSON2.Property(property1.Name);
                //Printout the difference between two APIs
                if (property2 == null){
                    Console.WriteLine(property1.Name);
                    Console.WriteLine(property1.Value);
                }
                else if (!JToken.DeepEquals(property1.Value, property2.Value)){
                    Console.WriteLine(property1.Name);
                    Console.WriteLine(property1.Value);
                }
            }
        }
        [OneTimeTearDown]
        public void Close(){
            //driver.Close();
            //driver.Quit();
        }
    }
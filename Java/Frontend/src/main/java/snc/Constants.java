package com.CibcSrvsNow.Properties;
/**@author Ram*/
public class Constants {
	
	//public static final String NEW_LINE = System.getProperty("line.separator");
	
	//Urls
		public static final String UrlSndBx2SdDr = "https://cibcsandbox2.service-now.com/side_door.do";
		public static final String UrlSitSdDr = "https://cibcsit.service-now.com/cibcport";
		public static final String UrlSitClsVw = "https://cibcsit.service-now.com";
		public static final String UrlSndBx2 = "https://cibcsandbox2.service-now.com/navpage.do";
		public static final String UrlSit = "https://cibcsit.service-now.com/navpage.do";
	// Modules inside the Service Catalogs
		public static final String ServiceCata="SERVICE CATALOG";
		public static final String Pepl_LnkTxt= "People";
		public static final String Pplviewall = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div[3]/div/div/div/div[2]/div/a";
		public static final String Standarduser = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div[3]/div/div/div/div[3]/div/div[3]/div/a/div/div[1]/h2";
		public static final String Mortgageuser = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div[3]/div/div/div/div[3]/div/div[1]/div/a/div/div[1]/h2";
		public static final String Executiveuser = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div/div/div/div/div[3]/div/div[6]/div/a/div/div[1]/h2";
		public static final String Contactuser = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div/div/div/div/div[3]/div/div[5]/div/a/div/div[1]/h2";
		public static final String BuznsSrvsLnkTxt= "BusinessServices";
		public static final String ApplLnkTxt = "Applications";
		public static final String HwrLnkTxt = "Hardware";
		public static final String CmntionsLnkTxt = "Communication";
		public static final String CommViewAll = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div[6]/div/div/div/div[2]/div/a";
		public static final String EmailViewAll = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div[2]/div/div/div/div[2]/div/a";
		public static final String CitrixExternal = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div/div/div/div/div[3]/div/div[7]/div/div/a";
		public static final String VPN = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div/div/div/div/div[3]/div/div[5]/div/a/div/div[1]/h2";
        public static final String MessageColla = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div[3]/div/div/div/div[2]/div/a";
		public static final String Sharepoint = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div/div/div/div/div[3]/div/div[9]/div/a/div/div[1]/h2";
		public static final String Sharefolder = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div/div/div/div/div[3]/div/div[8]/div/a/div/div[1]/h2";
		public static final String CommunitySite = "/html/body/div/section/main/div[3]/div/sp-page-row/div/div/span/div/div/div/div/div/div[3]/div/div[2]/div/a/div/div[1]/h2";
		public static final String Distributionlist = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div[2]/div/div/div/div[3]/div/div[2]/div/a/div/div[1]/h2";
		public static final String Groupchat = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div/div/div/div/div[3]/div/div[6]/div/a/div/div[1]/h2";
		public static final String ScrtyLnkTxt = "Security";
		public static final String InfraSrvsLnkTxt = "Infrastructure Services";
		public static final String OthrsLnkTxt = "Other";
		public static final String SrvsCatSrchName= "q";
		public static final String Rqst4ID = "select2-chosen-35";
	//Crednstlsvals
		public static final CharSequence TskAgntV = "Jyot Dhillon";
		public static final CharSequence RitmAgnt = "Kavitha Sivalingam";
		public static final CharSequence MngrV = "Nella Bogdanovic";
		public static final CharSequence FreValV = "Test";
		public static final CharSequence ExtPhnV = "0000";
		public static final CharSequence PhnV = "9355550000";
		public static final CharSequence HrdWrV = "RTC Hard Phone";
		public static final CharSequence WrkStnFldV = "935A";
		public static final CharSequence AdrsFlVal = "#11DUNDAS";
		public static final CharSequence NavGetItLnkX = "get";
		public static final String UsrVal = "ramsunder.anguloori@cibc.com";
		public static final String PasVal = "Test123!";
	// Driver exe Paths
		public static final String IE_Driver_Path = "C:\\SeleniumJars\\BrowserDrivers\\IEDriverServer.exe";
		public static final String Chrome_Driver_Path = "C:\\Users\\woxia\\Desktop\\DOCS\\QA\\Automation\\Resource\\Drivers\\chromedriver.exe";
		public static final String Firefox_Driver_Path = "";
		public static final String SncSitPath = "https://cibcsit.service-now.com/side_door.do";
		public static final String SncDevPath = "https://cibcsandbox2.service-now.com/side_door.do";
		public static final String ScrnShtPath = "C://SeleniumWorkSpace/CibcSrvsNow/ScreenShots";
	// Locators ClassicView LoginPaged 
		public static final String UsrNamX = "//*[@id='username']";
		public static final String PsWrdX = "//*[@id='password']";
		public static final String OkBtnX = "//*[@name='login']";
		public static final String ImprsNmX = "//*[@id='user_info_dropdown']/div/span[1]";
		public static final String GetitXpth = "//a[@class='navbar-brand navbar-brand-logo ng-scope']";
	// Classic view old login screen
		public static final String OsUsrNamX = "//*[@id='user_name']";
		public static final String OsPsWrdX = "//*[@id='user_password']";
		public static final String OsOkBtnX = "//*[@id='sysverb_login']";
	// Locators ClassicView LoginPaged 
		public static final String HomeXpth = "//*[@id='x7cf4c016dbab63005d46d7bb5e961997']/div[1]/ul/li[1]/a";
		public static final String SrvsCtlgXpth = "//*[@id='x7cf4c016dbab63005d46d7bb5e961997']/div[1]/ul/li[2]/a";
		public static final String MyRqstsXpth = "//*[@id='x7cf4c016dbab63005d46d7bb5e961997']/div[1]/ul/li[3]/a";
		public static final String ClsicVuXpth = "//*[@id='x7cf4c016dbab63005d46d7bb5e961997']/div[1]/ul/li[7]/a";
		public static final String CibcMelnPortl = "//*[@id=\"x7cf4c016dbab63005d46d7bb5e961997\"]/div[1]/ul/li[8]/a";
		public static final String ShpngCrtXpth = "//*[@id='cart-dropdown']";
		public static final String ProflXpth = "//*[@id='profile-dropdown']/span/div/div/div/span";
		public static final String DtaAceeVAXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div[1]/div/div/div/div[2]/div/a";
		public static final String dvTchVAXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div[2]/div/div/div/div[2]/div/a";
		public static final String PPrvIdXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div[4]/div/div/div/div[2]/div/a";
		public static final String SrtyExmpXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div[6]/div/div/div/div[2]/div/a";
		public static final String CdrdataXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div[1]/div/div/div/div[3]/div/div[1]/div/div/a";
		public static final String CdrdtaCBMlnXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div[1]/div/div/div/div[3]/div/div[2]/div/div/a";
		public static final String EmlDtaXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div[1]/div/div/div/div[3]/div/div[3]/div/div/a";
		public static final String EmlDtaCBMlnXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[4]/div/div/a";
		public static final String FdrtnIdXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[5]/div/div/a";
		public static final String HdrDtaXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[6]/div/div/a";
		public static final String PdrDtaXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[7]/div/div/a";
		public static final String ScZipDtaXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[8]/div/div/a";
		public static final String ScZpDtaCbcMlnXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[9]/div/div/a";
		public static final String CbcPrvIdXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[1]/div/div/a";
		public static final String HPPrvIdXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[2]/div/div/a";
		public static final String Lnx7PrvSrvAcsXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[3]/div/div/a";
		public static final String Lnx7PrvSrvAcsIbmXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[4]/div/div/a";
		public static final String PIMSfMngmntXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[5]/div/div/a";
		public static final String PrvIdOnrModXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[6]/div/div/a";
		public static final String RACFIDXpth = "//*[@id='xe183cfc9db5c7f001ccbdd8b5e961991']/div/div/div/div/div[3]/div/div[7]/div/div/a";
		public static final String FltrNvX = "//*[@id='filter']";
		public static final String GetItLnkX = "//*[@id=\"392344aedb2ef7441ccbdd8b5e961978\"]/div/div";
		public static final String PplModlX = "//*[@id=\"body\"]/div[2]/div/div[1]/a/div/div[1]/div/img";
		public static final String SrvsCatX = "//*[@id=\"x7cf4c016dbab63005d46d7bb5e961997\"]/div[1]/ul/li[2]/a";
		public static final String LevOfAbsncX = "//*[@id=\"xe183cfc9db5c7f001ccbdd8b5e961991\"]/div[1]/div/div/div/div[3]/div/div[1]/div/a/div/div[1]/h2";
		public static final String TelCkBxX = "//*[@id=\"sp_formfield_chktele_line\"]";
		public static final String NxtBtnX = "//*[@id=\"submit\"]";
		public static final String  Reports_Path = "C:\\SeleniumWorkSpace\\CibcSrvsNow";
		public static final String AsynmntGrp = "//*[@id=\"sys_display.sc_task.assignment_group\"]";
		public static final String Save = "//*[@id=\"sysverb_update_and_stay\"]";
		public static final String AsynToMe = "//*[@id=\"assign_to_me\"]";
		public static final String WrkNotes = "//*[@id=\"sc_task.work_notes\"]";
		public static final String CompletTsk = "//*[@id=\"u_complete_task\"]";
		public static final String ClkSrchGlas = "/html/body/div[5]/div/div/header/div[1]/div/div[2]/div/div[4]/form/div/label/span";
		public static final String GloblSrch = "//*[@id=\"sysparm_search\"]";
		public static final String TskState = "//*[@name='sys_readonly.sc_task.state' and @id='sys_readonly.sc_task.state'] ";
		public static final CharSequence AsynmntGrpValu = "tsc.to-ics.rrt";
		public static final String Ifram = "gsft_main";
		public static final String ImprsUserLst = "//*[@id=\"glide_ui_impersonator\"]";
		public static final String ClkImprsnFld = "//*[@id=\"select2-chosen-2\"]";
		public static final String AutoGenSrch = "//*[@id=\"s2id_autogen2_search\"]";
		public static final String ClcAutoGenSrch = "//*[@id=\"select2-result-label-3\"]";
		public static final String ClkAprvrsTb = "//*[@id=\"tabs2_list\"]/span[2]/span";//*[@id="tabs2_list"]/span[2]/span
		public static final String ClkChldNumTbl = "//table[@id='sc_request.sysapproval_approver.sysapproval_table']/tbody/tr/td[3]/a";
		public static final String ClkAprvBtn = "//*[@id=\"approve_bottom\"]";
		public static final String ClkGetAprvNamTbl = "//table[@id='sc_request.sysapproval_approver.sysapproval_table']/tbody/tr/td[4]";
		public static final String GetAprvNamTbl = "//table[@id='sc_request.sysapproval_approver.sysapproval_table']/tbody/tr/td[5]/a";
		public static final String ClkRqstItmTb = "//*[@id=\"tabs2_list\"]/span[1]/span";
		public static final String ClkTable = "//table[@id='sc_request.sc_req_item.request_table']/tbody/tr";
		public static final String ClkNumlnkTbl = "//table[@id='sc_request.sc_req_item.request_table']/tbody/tr/td[3]/a";
		public static final String ClkScndNumlnkTbl = "//table[@id='sc_request.sc_req_item.request_table']/tbody/tr[1]/td[3]/a";
		public static final String ClkTskNumTbl = "//table[@id='sc_req_item.sc_task.request_item_table']/tbody/tr[1]/td[3]/a";
		public static final String GetTskNumrs = "//table[@id='sc_req_item.sc_task.request_item_table']/tbody/tr";
		public static final String ClkTskNumLnk = "//table[@id='sc_req_item.sc_task.request_item_table']/tbody/tr[1]/td[3]/a";
		public static final String EfctvDtTime = "//*[@id=\"sp_formfield_effectiveDateTime\"]";
		public static final String CalndrLogo = "//*[@id=\"effectiveDateTime\"]/div/span/div/span/button";
		public static final String RtAroCalndr = "/html/body/div[2]/ul/li[1]/div/div[1]/table/thead/tr[1]/th[3]";
		public static final String Clkday = "/html/body/div[2]/ul/li[1]/div/div[1]/table/tbody/tr[1]/td[1]/div";
		public static final String PhnSrvsFrm = "//*[@id=\"item_name_0a7f9c65e97b34007fbee7b94859c231\"]";
		public static final String AdrsFld = "//*[@id='s2id_sp_formfield_address']/a";
		public static final String AdrsDrpDwnFld = "//*[@id=\"select2-drop\"]/div/input";
		public static final String WrkStnFld = "//*[@id=\"sp_formfield_workstation\"]";
		public static final String RqstFld = "//*[@id=\"select2-chosen-22\"]";
		public static final String SlctFrstDrpDwn = "//*[@id=\"select2-drop\"]/div/input";
		public static final String PhnFld = "//*[@id=\"sp_formfield_phone_no\"]";
		public static final String ExtnPhn = "//*[@id=\"sp_formfield_extension_no\"]";
		public static final String CmntsFld = "//*[@id=\"sp_formfield_comments\"]";
		public static final String Ordr = "order";
		public static final String ChkOut = "//*[@id=\"x44001e05dbf7af001ccbdd8b5e9619be\"]/div/div/div[1]/div/div/div[2]/button";
		public static final String RqstNum = "//*[@id='x10ced8b3dbcef7c01ccbdd8b5e96194a']/div/div/div[2]/div/div/ul/li/div[2]/div[2]/p";
		public static final String RqstNum1 = "//p[@class='ng-binding']";
		public static final String Lndngpag_Title = "ETS Problem Ticket Dashboard | ServiceNow Service Automation";
		public static final String GetIT_Title = "CIBC Service Portal - CIBC Portal";
		public static final String befor_hmPgLoad= "Home page loading... | ServiceNow Service Automation";
		public static final String EnvSb2 = "Instance = Sandbox2";
		public static final String EnvSit = "InstanceSIT";
		public static final String FrameWork = " FrameWork = PageObjectModel/PageFactoy";
		public static final String OrdrSrvsNwX = "//*[@id='xbdb31309db22f3445d46d7bb5e961985']/div/a";
		public static final String LearnITX = "//*[@id=\"x4b141b09db22f3445d46d7bb5e9619c3\"]/div/a";
		public static final String ContctUsX = "//*[@id=\"x8ec49709db22f3445d46d7bb5e9619e1\"]/div/a";
		public static final String SbmtTkctX = "//*[@id=\"x1db4f4a2db708410e10e3abf9d9619f6\"]/div/div/div/div[2]/div/a";
		public static final String TypIsuX = "//*[@id=\"s2id_sp_formfield_type_of_issue\"]/a";//*[@id="s2id_sp_formfield_type_of_issue"]/a/span[2]/b
		public static final String TypIsuDrpDnFldX = "//*[@id=\"s2id_autogen1_search\"]";
		public static final String TypPrtrIsuX = "//*[@id=\"select2-chosen-2\"]";
		public static final String TypPrtrIsuDrpDnFldX = "//*[@id='s2id_autogen2_search']";
		public static final String MkPrtrX = "//*[@id='select2-chosen-4']";
		public static final String MkPrtrDrpDnFldX = "//*[@id='s2id_autogen4_search']";
		public static final String ModNumX = "//*[@id='sp_formfield_model_number']";
		public static final String SrlNumX = "//*[@id='sp_formfield_serial_number']";
		public static final String AsetTgX = "//*[@id='sp_formfield_asset_tag']";
		public static final String CntckPhNumX = "//*[@id='sp_formfield_u_contact_phone_number']";
		public static final String DskLocaPhX = "//*[@id='sp_formfield_desk_location']";
		public static final String DscrbIsuX = "//*[@id='sp_formfield_description']";
		public static final String SbmtBtnX = "//*[@name='submit']";
		
		
		
		
	
		                                                                   

	
	
	
}

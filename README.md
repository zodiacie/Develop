# FullStack
电商实战项目  
![aHR0cHM6Ly9uZXdiZWUtbWFsbC5vc3MtY24tYmVpamluZy5hbGl5dW5jcy5jb20vcG9zdGVyL3N0b3JlL25ld2JlZS1tYWxsLXMucG5n](https://github.com/zodiacie/FullStack/assets/57634982/37dc2129-af68-4921-9faa-570678008a74)  
1)NewBee电商 https://github.com/newbee-ltd/newbee-mall  
2)Swarm微服务 https://github.com/macrozheng/mall-swarm  
3)SpringCloud https://github.com/SiGuiyang/spring-cloud-shop  
4)移动端电商 https://github.com/lucisl/ddBuy  
5)Mall4J电商 https://github.com/gz-yami/mall4j  
6)仿小米电商(NodeJS) https://gitee.com/hai-27/vue-store  
7)Lilishop https://gitee.com/beijing_hongye_huicheng/lilishop  

目录:  
[Bitcoin Setup](#bitcoin)  
[Etherum Setup](#etherum)  

<a name = "bitcoin">Bitcoin Private Chain Setup</a>
1) 比特币区块链是两遍SHA256的Hash算法
   https://learnku.com/python/t/22970/build-your-own-block-chain-step-by-step-with-python
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/b15cd35d-6f0d-4a70-a36a-c20524e79918)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/5d86f544-976f-443a-b8a3-594e9c7506f7)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/fb978539-01b2-4b3a-8c66-841fc0cf9f57)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/f51ef9fe-e8b3-48d9-9148-1fa69274fbd6)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/1fb55f62-f653-4c04-9791-43eba51d95bc)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/f6f22110-2814-4313-97c4-6eb36be3ceba)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/8f261512-53ed-49e0-8190-258f6bc00d8c)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/a576828a-539e-4c83-a040-2f5127c347b3)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/09a44eb2-6329-444b-bfb6-4a692ab669e5)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/e822fd29-4adc-40cf-8da9-5c173237f184)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/a5b18155-c7c3-4b65-a284-2a515a0a46cd)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/97f68235-bb88-471c-b01a-de5493101027)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/d7e5268c-8181-4138-8899-0597cc54d46c)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/cc0df12d-3b96-4c19-9cf2-fafdca54bfc4)

<a name = "etherum">Ethrum Private Chain Setup</a>
1) 以太坊区块链通过读取Memory Hard Mining Puzzle。 以太坊中，设计了两个数据集，一大一小。小的为16MB的cache，大的数据集为1G的dataset(DAG)，1G的数据集是通过16MB数据集生成而来的。16MB的Cache数据生成方式：通过Seed进行一些运算获得第一个数,之后每个数字都是通过前一个位置的值取哈希获得的大的DAG生成方式：大的数组中每个元素都是从小数组中按照伪随机顺序读取一些元素。如第一次读取A位置数据，对当前哈希值更新迭代算出下一次读取位置B，再进行哈希值更新迭代计算出C位置元素。如此来回迭代读取256次，最终算出一个哈希值作为DAG中第一个元素，如此类推，DAG中每个元素生成方式都依次类推。
   https://learnblockchain.cn/books/geth/part2/consensus/ethash_implement.html
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/8a59fdab-6998-4614-ae86-2a120dbd0949)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/3f7caf14-ddc1-4b9d-9043-e67860336fae)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/200c8535-68f6-4898-818f-7f691096ef05)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/4f4e5091-b352-4d90-a75f-26bea3c5985d)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/b691bdba-0d56-44d3-b5c7-045815da28be)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/d64bfbdd-0959-46cc-ba44-c4e0bc4f830b)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/ec8f0fb6-29db-4d16-9fec-48aa3acce420)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/042fa707-dcb0-404c-8402-628dcebef62c)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/d2bd02b0-7dd8-4fe7-858e-92d4fe9545cf)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/54e78b8b-3a0f-433a-88e6-1a8bb73417f1)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/3f08ce0b-fe24-4115-ad5d-c5a6d06bc7d4)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/2b62beb8-c823-422e-8170-98162bd9a6e0)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/f91c66e3-8da7-4d6f-a1e2-097a0981e8e3)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/7a7e5656-b379-4290-a4ca-06a46bd196d2)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/f2617a1a-be13-4fda-993c-ccb769b0bf03)
2) 挖矿算法
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/9b8f8b62-5160-4aa2-8821-50875e62254f)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/274ed11e-bf6e-4d49-a9b1-de3ad155c514)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/0d6397c2-0c0f-4091-bf0b-76013a4206ab)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/e8bb2c62-ca5a-42f3-8164-b2536d04538c)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/8e86885e-9648-43ee-830c-1e535c631c26)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/54d7f704-1547-4ec9-8d52-b4b791af6257)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/4febd913-adab-43ab-bb15-375bbbaf0313)
   ![image](https://github.com/zodiacie/FullStack/assets/57634982/63fe72b3-71e6-43ef-9d2d-cd7d853a35ea)
3) 以太坊私有链创建
   https://blog.csdn.net/andy_zhang2007/article/details/102858390



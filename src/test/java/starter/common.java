package starter;

import org.junit.Assert;
import org.openqa.selenium.json.Json;
import starter.pojo.Product;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class common {

    public static String colaTitle = "First Choice Cola regular;Highway Cola light;Coca-cola Original taste;Pepsi Cola;First Choice Cola cafeïne  vrij;Pepsi Cola max;Coca-cola Zero sugar;Coca-Cola Zero sugar;Coca-Cola Light Taste;Coca-Cola Blik;Coca-cola zero sugar 4*1.5L;First Choice Cola;Coca-cola Original taste ;Coca-Cola Zero Sugar PET fles;Coca-Cola Regular;Coca-cola Zero sugar;Coca-Cola Blik;Cola zero;Cola regular;g'woon Cola";

    public static String pastaTitle = "PLUS Mini penne volkoren;Selezione Ristorante Gevulde pasta paddenstoelen;Grand'Italia pipe rigate;Grand'Italia Pasta penne all'uovo;Unox Good pasta spag.bolog;Unox Good Pasta kaas;Grand'Italia Pasta penne tradizionali;PLUS Pipe rigate;Ankara Spaghetti;PLUS penne rigate;Knorr Tomaten penne;Knorr Groentepasta spaghetti tomaat;Knorr Groentepasta spaghetti spinazie;Grand'Italia Tortellini ai formaggi;Djawa Tamarinde pasta;Grand'Italia Pasta macaroni tradizionale;Selezione Ristorante Gevulde pasta basilicum;Grand'Italia Tagliatelle;Grand'Italia Tortellini formaggi;Bio+ Tagliatelle";
    static Product[] productList;
    public static void validation(String provider, String title, String url, String brand, double price, String unit,  String image) {
        Product actualProduct =new Product(provider, title,  url,  brand,  price,  unit,   image);

        switch (title) {
            case "Grand'Italia Pasta penne all'uovo":
                Product expectedProduct =new Product("Coop","Grand'Italia Pasta penne all'uovo","https://www.coop.nl/product/8000050026113","GranFood B.V.",2.68,"500 g","https://syndy-content.azureedge.net/media/products/5c290000-ff27-0003-bd14-08d6ac4a1a61/images/AW0HA3GItENDpZ-NPK0ohvI./AADDJSf-AwAONAjXzOl8mA.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;

            case "Selezione Ristorante Gevulde pasta basilicum":
                 expectedProduct =new Product("Coop","Selezione Ristorante Gevulde pasta basilicum","https://www.coop.nl/product/8710624322014","Superunie",2.99,"250 g","https://syndy-content.azureedge.net/media/products/505b0000-ff27-0003-1a2a-08d832337e6e/images/AW0HA3GItENDpZ-NPK0ohvI./AAD9gCf-AwB9BgjYU6vryg.670x670.jpg");
                 Assert.assertEquals(actualProduct,expectedProduct);
                break;

            case "Djawa Tamarinde pasta":
            expectedProduct =new Product("Coop","Djawa Tamarinde pasta", "https://www.coop.nl/product/8710161532914","Vanka-Kawat Daily Amsterdam B.V.",3.1,"200 g","https://syndy-content.azureedge.net/media/products/79360000-ff27-0003-14db-08d87a644f1b/images/AW0HA3GItENDpZ-NPK0ohvI./AACP7tVE7_ZzEgjYhXW6YA.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;

            case "Grand'Italia Tortellini ai formaggi":
                expectedProduct =new Product("Coop","Grand'Italia Tortellini ai formaggi","https://www.coop.nl/product/8000050023259","GranFood B.V.",3.14,"220 g","https://syndy-content.azureedge.net/media/products/07ce0000-ff41-0003-7860-08d3b6bee968/images/AW0HA3GItENDpZ-NPK0ohvI./AAQM9CQ6DQBmYwjbtPN8xw.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;
                

            case "Unox Good pasta spag.bolog":
                expectedProduct =new Product("Coop","Unox Good pasta spag.bolog","https://www.coop.nl/product/8714100826492","Unilever Nederland B.V.",1.84,"68 g","https://syndy-content.azureedge.net/media/products/62160000-5d4a-0015-7a18-08d61facaece/images/AW0HA3GItENDpZ-NPK0ohvI./AAAmWCf-AwCdcAjbKp06DQ.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;
//
            case "Bio+ Tagliatelle":
                expectedProduct =new Product("Coop","Bio+ Tagliatelle","https://www.coop.nl/product/8710624293321","Superunie",1.42,"375 g","https://syndy-content.azureedge.net/media/products/2d740000-ff27-0003-caa3-08d71f190cb5/images/AW0HA3GItENDpZ-NPK0ohvI./AABKcyf-AwAGPgjZuUcv0g.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;

            case "PLUS Mini penne volkoren":
                expectedProduct =new Product("Coop","PLUS Mini penne volkoren","https://www.coop.nl/product/8718989814595","Superunie",1.04,"500 g","https://syndy-content.azureedge.net/media/products/8c1e0c00-3a24-000d-0272-08dbef5b248c/images/AW0HA3GItENDpZ-NPK0ohvI./AAAAWQYQ8zr1-Qjb8O_0KA.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;


            case "Unox Good Pasta kaas":
                expectedProduct =new Product("Coop","Unox Good Pasta kaas","https://www.coop.nl/product/8714100829769","Unilever Nederland B.V.",1.84,"69 g","https://syndy-content.azureedge.net/media/products/62160000-5d4a-0015-47c1-08d61facae1d/images/AW0HA3GItENDpZ-NPK0ohvI./AAwYDCQ6DQBXKAjbs3Oo9w.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;


            case "Grand'Italia Pasta macaroni tradizionale":
                expectedProduct =new Product("Coop","Grand'Italia Pasta macaroni tradizionale","https://www.coop.nl/product/8000050026199","GranFood B.V.",1.89,"500 g","https://syndy-content.azureedge.net/media/products/6e790000-ff4b-0003-be58-08d67491dd5e/images/AW0HA3GItENDpZ-NPK0ohvI./AADDJSf-AwAnXwjXzOl8nQ.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;

            case "PLUS penne rigate":
                expectedProduct =new Product("Coop","PLUS penne rigate","https://www.coop.nl/product/8718989814571","Superunie",0.95,"500 g","https://aosa.org/wp-content/uploads/2019/04/image-placeholder-350x350.png");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;

            case "Grand'Italia Tagliatelle":
                expectedProduct =new Product("Coop","Grand'Italia Tagliatelle","https://www.coop.nl/product/8000050840924","GranFood B.V.",3.62,"500 g","https://syndy-content.azureedge.net/media/products/801dc5f0-b27d-44b1-83ba-009a1fc3a614/images/AW0HA3GItENDpZ-NPK0ohvI./AADDJSf-AwCzIQjXzOmN_Q.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;

            case "Knorr Groentepasta spaghetti spinazie":
                expectedProduct =new Product("Coop","Knorr Groentepasta spaghetti spinazie","https://www.coop.nl/product/8720182525291","Unilever Nederland B.V.",3.14,"300 g","https://syndy-content.azureedge.net/media/products/4a840000-ff27-0003-110d-08db3f3996a9/images/AW0HA3GItENDpZ-NPK0ohvI./AACESif-AwAmMQjbP9Kj5g.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;


            case "Grand'Italia Pasta penne tradizionali":
                expectedProduct =new Product("Coop","Grand'Italia Pasta penne tradizionali","https://www.coop.nl/product/8000050838921","GranFood B.V.",1.89,"500 g","https://syndy-content.azureedge.net/media/products/534e135b-0185-43f9-89c2-98e9df39b73e/images/AW0HA3GItENDpZ-NPK0ohvI./AAB4bSf-AwAkRgjZFEIMUg.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;


            case "Knorr Tomaten penne":
                expectedProduct =new Product("Coop","Knorr Tomaten penne","https://www.coop.nl/product/8720182524836","Unilever Nederland B.V.",3.14,"300 g","https://syndy-content.azureedge.net/media/products/5a130000-ff27-0003-2cf1-08dab0f6b1d1/images/AW0HA3GItENDpZ-NPK0ohvI./AAATWif-AwDCjgjavJd6gQ.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;


            case "Grand'Italia pipe rigate":
                expectedProduct =new Product("Coop","Grand'Italia pipe rigate","https://www.coop.nl/product/8000050839829","GranFood B.V.",1.89,"500 g","https://syndy-content.azureedge.net/media/products/a58711fe-2972-46e6-b0e8-347a97b2984f/images/AW0HA3GItENDpZ-NPK0ohvI./AAUGDCQ6DQBH9wjbzuFe0g.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;


            case "Ankara Spaghetti":
                expectedProduct =new Product("Coop","Ankara Spaghetti","https://www.coop.nl/product/8690576029004","Inno Food Company B.V.",1.14,"500 g","https://syndy-content.azureedge.net/media/products/1dc48a27-0de9-415a-b291-c6789a7c7e23/images/AW0HA3GItENDpZ-NPK0ohvI./AADDJSf-AwCW9wjXzOp5EQ.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;


            case "Selezione Ristorante Gevulde pasta paddenstoelen":
                expectedProduct =new Product("Coop","Selezione Ristorante Gevulde pasta paddenstoelen","https://www.coop.nl/product/8710624367411","Superunie",2.99,"250 g","https://syndy-content.azureedge.net/media/products/505b0000-ff27-0003-dcff-08d832337ed3/images/AW0HA3GItENDpZ-NPK0ohvI./AAD9gCf-AwBLCQjYU6vrvA.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;

            case "Grand'Italia Tortellini formaggi":
                expectedProduct =new Product("Coop","Grand'Italia Tortellini formaggi","https://www.coop.nl/product/8000050023242","GranFood B.V.",5.24,"440 g","https://syndy-content.azureedge.net/media/products/3ef90000-ff41-0003-062b-08d3af355f86/images/AW0HA3GItENDpZ-NPK0ohvI./AABwTif-AwBIFgjaKBNjhw.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;

            case "Knorr Groentepasta spaghetti tomaat":
                expectedProduct =new Product("Coop","Knorr Groentepasta spaghetti tomaat","https://www.coop.nl/product/8720182525222","Unilever Nederland B.V.",3.14,"300 g","https://syndy-content.azureedge.net/media/products/4a840000-ff27-0003-0554-08db3f39951a/images/AW0HA3GItENDpZ-NPK0ohvI./AACESif-AwCfEAjbP9Kjwg.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;

            case "PLUS Pipe rigate":
                expectedProduct =new Product("Coop","PLUS Pipe rigate","https://www.coop.nl/product/8718989814557","Superunie",1.19,"500 g","https://syndy-content.azureedge.net/media/products/20190100-3a24-000d-b6ba-08dbc8d35b49/images/AW0HA3GItENDpZ-NPK0ohvI./AAwY_CQ6DQAV6gjb32rBhA.670x670.jpg");
                Assert.assertEquals(actualProduct,expectedProduct);
                break;

        }
}

}

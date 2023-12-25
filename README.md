1.Added Two Scneraio in post_product.feature

2.The first scenario deals with, hitting the get rquest and verifyning the status code.

3.Whereas the second scenario checks the content of json response for the particular product.

4.For now I have verified the entire content for only "pasta".We can do the same for "cola".As Of now for cola,I have only veriifed the title.

Refactor

1.Changed the pom.xml and added necessay jar and updated the existing jar.

2.Used pojo class to capture the json response.

3.Also used JsonPath to capture response. 

4.Added Verification steps to verify the json content.
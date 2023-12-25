1.Added two scenarios in post_product.feature

2.The first scenario deals with, hitting the get request and verifying the status code.

3. Whereas the second scenario checks the content of the JSON response for the particular product.

4. For now, I have verified the entire content for only "pasta." We can do the same for "cola." As Of now for cola , I have only verified the title.

Refactor

1.Changed the pom.xml and added necessay jar and updated the existing jar.

2.Used pojo class to capture the json response.

3.Also used JsonPath to capture response. 

4.Added Verification steps to verify the json content.

Configured the CICD pipeline
Whenever someone performs any push or pull from the repository,automatically the build will trigger and the test will be executed

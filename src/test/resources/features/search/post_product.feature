Feature: Search for the product

    ### Please use endpoint GET https://waarkoop-server.herokuapp.com/api/v1/search/demo/{product} for getting the products.
### Available products: "orange", "apple", "pasta", "cola"
### Prepare Positive and negative scenarios

  Scenario Outline:Verify the Status Code
    When he calls endpoint for the '<product>'
    Then verify the '<status code>' for the product
    Examples:
      | product | status code |
      | pasta   | 200         |
      | apple   | 200         |
      | orange  | 200         |
      | cola    | 200         |
      | pepsi   | 404         |


  Scenario Outline:Verify the json response
    When he calls endpoint for the '<product>'
    Then check the response of the '<product>'

  Examples:
    | product |
#    | pasta   |
#    | apple   |
#    | orange  |
    | cola    |

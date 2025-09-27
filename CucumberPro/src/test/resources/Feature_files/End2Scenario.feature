@tag
Feature: Search hotel on Adactin Hotel

  @hotel1
  Scenario Outline: User searches for a  hotel with vaild details
    Given the user is logged in to adactin hotel webpage
    When the user select the Location "<locationName>"
    And the user select the Hotels "<hotelName>"
    And the user select the RoomType "<roomType>"
    And the user select the NumberofRoom "<numOfRoom>"
    And the user enter the check in date "<checkIn>"
    And the user enter the check out date "<checkOut>"
    And the user select the Adults per room "<adultsRoom>"
    And the user select the children per room "<childRoom>"
    And the user clicks on search
    Then the hotels details should be displayed "<selectHotel>"

    Examples: 
      | locationName |  | hotelName   |  | roomType |  | numOfRoom |  | checkIn    |  | checkOut   |  | adultsRoom |  | childRoom |  |selectHotel|
      | Melbourne    |  | Hotel Creek |  | Standard |  | 2 - Two   |  | 02/03/2026 |  | 07/03/2026 |  | 2 - Two    |  | 2 - Two   |  |Select Hotel|

  Scenario Outline: User searches for a  hotel with Mandatory details
    Given the user is logged in to adactin hotel webpage
    When the user select the Location "<locationName>"
    And the user select the NumberofRoom "<numOfRoom>"
    And the user enter the check in date "<checkIn>"
    And the user enter the check out date "<checkOut>"
    And the user select the Adults per room "<adultsRoom>"
    And the user clicks on search
    Then the hotels with  Mandatory details  should be displayed "<selectHotel>"

    Examples: 
      | locationName |  | numOfRoom |  | checkIn    |  | checkOut   |  | adultsRoom | |selectHotel|
      | Melbourne    |  | 2 - Two   |  | 02/03/2026 |  | 07/03/2026 |  | 2 - Two    | |Select Hotel|

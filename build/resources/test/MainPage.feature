@01_MainPage @Html_editor
Feature: Html_editor: 01_Main Page.feature

  # Использовние языка Gherkin для написания тест-кейсов (feature файлов): https://cucumber.io/docs/gherkin/
  # Использование инструмента Cucumber для реализации BDD-подхода: https://cucumber.io/docs/cucumber/
  # Использование фреймворка Selenium (Selenide): https://www.selenium.dev/documentation/
  # Использование фреймворка JUnit: https://junit.org/junit5/
  # Для написание автоматических тестов используется язык Java 8: https://www.java.com/ru/
  # Тестирование UI

  Background:
    When I go to the "Main" application page

  @01_01_MainPage @DisplayWebsite @Auto
  Scenario: 01_01_MainPage. Displaying Main page
    Then The left-side bar elements is displayed correctly
    And The right-side bar elements is displayed correctly
    And The "canvas", "html", "css" buttons are displayed correctly
    And The "download", "clean" icons are displayed correctly
    And The main workspace is displayed correctly

  @02_01_MainPage @DisplayCanvas @Auto
  Scenario: 02_01_MainPage. Canvas area is displayed correctly
    When I click the "canvas" button
    Then The "canvas" area is displayed correctly
    And I see empty block for any elements

  @03_01_MainPage @DisplayHtml @Auto
  Scenario: 03_01_MainPage. Html area is displayed correctly
    When I click the "html" button
    Then The "html" area is displayed correctly
    And I see the default html-body text

  @04_01_MainPage @DisplayCCS @Manual
  Scenario: 04_01_MainPage. CCS area is displayed correctly
  .  When I click the "css" button
  .  Then The "ccs" area is displayed correctly
  .  And I see empty area for css-properties

  @05_01_MainPage @ComponentsMovement @Manual
  Scenario: 05_01_MainPage. Move component from left bar to canvas
  .  When I select current block
  .  When I click "any" component-icon on left-side bar
  .  Then The current element is displayed on the current selected block
  .  Then The all properties are displayed for this component
  .  Then The "X" icon for delete element is appeared

  @06_01_MainPage @ComponentsMovement @Manual
  Scenario: 06_01_MainPage. Move component from one block to another
  .  When I click "any" element on workspace area
  .  Then The current element is displayed on the top of cursor while holding
  .  When I release mouse button on another block
  .  Then The current element is dropped on selected block

  @07_01_MainPage @RightBarChange @Manual
  Scenario: 07_01_MainPage. Current parameters are displayed and can be changed for each element
  .  When I select "any" element on workspace area
  .  When I see expanded the "html properties" and "css properties" dropdowns
  .  Then The right-side bar parameters is changed for current element
  .  When I change some css-parameters for selected element
  .  Then This changes are displayed on main canvas

  @08_01_MainPage @SearchForElement @Manual
  Scenario: 08_01_MainPage. Search for current elements on left-side bar
  .  When I enter "element name" into the "Search" field
  .  Then The search result for "element name" is displayed

  @09_01_MainPage @CanvasClean @Manual
  Scenario: 09_01_MainPage. Possibility to clean canvas via clean-icon
  .  Given I have some elements on canvas area
  .  When I click the "clean" icon on the top of page
  .  Then The canvas area is cleared of all elements
  .  And I see blank canvas

  @10_01_MainPage @DeletingElements @Manual
  Scenario: 10_01_MainPage. Possibility ti delete current element via "delete"-icon
  .  When I click "any" component-icon on left-side bar
  .  Then The current element is displayed on the current selected block
  .  Then The "X" icon for delete element is appeared
  .  When I click the "X" icon for delete current element
  .  Then This current element is deleted from canvas

  @11_01_MainPage @DownloadButton @Manual
  Scenario: 11_01_MainPage. Possibility to download html and css description of current canvas
  .  Given I have some elements on canvas area
  .  When I click the "html" button
  .  Then The html code-preview is displayed on workspace area
  .  When I click the "download" icon
  .  Then The html-file is downloaded successfully with current information
  .  When I click the "css" button
  .  Then The css code-preview is displayed on workspace area
  .  When I click the "download" icon
  .  Then The css-file is downloaded successfully with current information
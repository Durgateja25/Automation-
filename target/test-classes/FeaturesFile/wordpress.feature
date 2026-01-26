Feature: WordPress Automation
Scenario: Verify WordPress site

  Given user launches wordpress site
  Then verify page title

  When user clicks Get WordPress
  Then verify Get WordPress text

  When user opens photo directory
  And user searches image "crystal"
  Then images should be displayed

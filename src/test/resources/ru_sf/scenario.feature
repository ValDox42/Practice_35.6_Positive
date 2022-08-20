Feature: Filling cart
  Scenario: Cart is getting filled
    Given url of e2e4 'https://kemerovo.e2e4online.ru'
    When page is open search '832409'
    Then click buy button
    And check cart
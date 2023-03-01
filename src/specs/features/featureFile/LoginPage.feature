@authentification
Feature: Authentification sur lapplication nopcommerce
  En tanqt que utilisateur, je souhaite accèder à lapplication

  @login_CasPassant
  Scenario: Authentification valide sur l application SwagLabs-cas passant
    Given Je me connecte sur l application nopcommerce
    When Je remplis l email "admin@yourstore.com"
    And Je remplis le pass word "admin"
    And Je clique sur le buton LOGIN
    Then Je me redirige vers la page home "Dashboard"
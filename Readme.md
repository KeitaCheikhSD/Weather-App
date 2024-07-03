Voici le Readme du Projet 

La Documentation de Weather API : https://www.weatherapi.com/docs/#

Voici l'url de base pour les requetes  :

https://www.weatherapi.com/v1

l'URL ressemble à ça afin d'obtenir une reponse du serveur ressemble à ça :

http://api.weatherapi.com/v1/current.json?key=21cec8299302457083c140208242506&q=London&aqi=yes

My api Key sans quoi les requetes ne fonctionnent pas :

21cec8299302457083c140208242506

aqi correspond à :
aqi est (Optional)  
Fonctionnalité : New Enable/Disable Air Quality data in forecast API output
aqi=yes or aqi=no

Synthése de la documentation : 

| API                    | Méthode API                                     |
|------------------------|-------------------------------------------------|
| Météo actuelle         | /current.json ou /current.xml                   |
| Prévisions             | /forecast.json ou /forecast.xml                 |
| Recherche ou Autocomplétion | /search.json ou /search.xml                |
| Historique             | /history.json ou /history.xml                   |
| Marine                 | /marine.json ou /marine.xml                     |
| Futur                  | /future.json ou /future.xml                     |
| Fuseau horaire         | /timezone.json ou /timezone.xml                 |
| Sports                 | /sports.json ou /sports.xml                     |
| Astronomie             | /astronomy.json ou /astronomy.xml               |
| Recherche IP           | /ip.json ou /ip.xml                             |

Les requetes que je compte developper :

Current Weather :

Forecast :

Future :

Astronomy :
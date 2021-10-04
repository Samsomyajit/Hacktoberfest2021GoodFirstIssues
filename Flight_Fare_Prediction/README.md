# Flight_Fare_Prediction

## Table Of Content:
- Problem Statement
- DataSet Link
- Features detail
- Importings
- Score


> - ______________________________________________________________________________________________________________________________________________________________________________
![Test_Image1](https://wonderfulengineering.com/wp-content/uploads/2014/05/airplane-wallpaper-2.jpg)
> - ______________________________________________________________________________________________________________________________________________________________________________

- [DataSet Link](https://www.kaggle.com/nikhilmittal/flight-fare-prediction-mh)


 - ## Problem Statement
> - Flight ticket prices can be something hard to guess, today we might see a price, check out the price of the same flight tomorrow, it will be a different story. We might have often heard travelers saying that flight ticket prices are so unpredictable.  In the DataSet price is provided with prices of flight tickets for various airlines between the months of March and June of 2019 and between various cities.

> - Size of training set: 10683 records
> - Size of test set: 2671 records
> 
  - FEATURES DETAILS:
> 1. Airline: Name of the airline.
> 
> 2. Date_of_Journey: journey date.
> 
> 3. Source: The source from which the service begins.
> 
> 4. Destination: The destination where the service ends.
> 
> 5. Route: The route taken by the flight to reach the destination.
> 
> 6. Dep_Time: The time when the journey starts from the source.
> 
> 7. Arrival_Time: Time of arrival at the destination.
> 
> 8. Duration: Total duration of the flight.
> 
> 9. Total_Stops: Total stops between the source and destination.
> 
> 10. Additional_Info: Additional information about the flight.
> 
> 11. Price: The price of the ticket.

- Importings:

- import pandas as pd
- import numpy as np
- import matplotlib.pyplot as plt
- import seaborn as sns
- from sklearn.ensemble import ExtraTreesRegressor
- from sklearn.model_selection import train_test_split
- from sklearn.ensemble import RandomForestRegressor
- from sklearn import metrics
- from sklearn.model_selection import RandomizedSearchCV
- import pickle


> - Score:
metrics.r2_score(y_test, y_prediction)
=> .8130391097916131


> - ___________________________________________________________________________________________________________________________________________________________________________


![Test Image2](https://content.altexsoft.com/media/2021/08/word-image-20.png)



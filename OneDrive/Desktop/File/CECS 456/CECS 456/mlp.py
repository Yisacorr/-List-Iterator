import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
df = pd.read_csv("business.csv")

#df.info()
#print(df.columns)
x = df['SAT']
y = df['GPA']

X_train, X_test, Y_train, Y_test = train_test_split(x, y, test_size=0.3)

ln = LinearRegression()

ln.fit(X_train.values.reshape(-1,1), Y_train.values.reshape(-1,1))
#print(ln.intercept_)


y_pred = ln.predict(X_test.values.reshape(-1,1))
print(ln.coef_)
plt.show()

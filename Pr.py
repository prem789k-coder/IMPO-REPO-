import seaborn as sns
import matplotlib.pyplot as plt
# Load a built-in dataset from Seaborn
tips_df = sns.load_dataset('tips')
# Set the aesthetic style of the plots
sns.set_theme(style="darkgrid")
# Create a histogram with a Kernel Density Estimate (KDE)
plt.figure(figsize=(8, 5))
sns.histplot(data=tips_df, x='total_bill', kde=True, color='green')
# Add a title
plt.title('Distribution of Total Bill Amounts in Tips Dataset')
plt.xlabel('Total Bill ($)')
plt.ylabel('Frequency')
# Show the plot
plt.show()

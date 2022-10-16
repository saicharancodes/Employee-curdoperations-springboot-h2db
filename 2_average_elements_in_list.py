#to find the average of list of integers
l=list(map(int,input("enter elements in a same line:").split())) #input of list
sum=0
for i in l:
    sum+=i       #suming up of elements in the list by iterationg
print(f"average {sum/len(l)}") #gives the average of elements in the list
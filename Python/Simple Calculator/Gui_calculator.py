import tkinter as tk
from tkinter import ttk

root=tk.Tk()
root.geometry("500x150")
root.title("Calculator")

frame=ttk.Frame(root)
frame.pack()

ttk.Label(frame,text="First Number").grid(column=0,row=0,sticky=tk.E)
n1=ttk.Entry(frame,width=25)
n1.grid(column=1,row=0)

ttk.Label(frame,text="Second Number").grid(column=0,row=1,sticky=tk.E)
n2=ttk.Entry(frame,width=25)
n2.grid(column=1,row=1)

def add():    
  a=n1.get()
  b=n2.get()
  a=float(a)
  b=float(b)
  ttk.Label(frame,text="Result:     "+str(a+b)).grid(column=1,row=3)
  

def sub():    
  a=n1.get()
  b=n2.get()
  a=float(a)
  b=float(b)
  ttk.Label(frame,text="Result:     "+str(a-b)).grid(column=1,row=3)
  

def mul():    
  a=n1.get()
  b=n2.get()
  a=float(a)
  b=float(b)
  ttk.Label(frame,text="Result:     "+str(a*b)).grid(column=1,row=3)
  

def div():    
  a=n1.get()
  b=n2.get()
  a=float(a)
  b=float(b)
  ttk.Label(frame,text="Result:     "+str(a/b)).grid(column=1,row=3)

addB=ttk.Button(frame,text="Add",command=add).grid(column=0,row=2)
addB=ttk.Button(frame,text="Sub",command=sub).grid(column=1,row=2)
addB=ttk.Button(frame,text="Mul",command=mul).grid(column=2,row=2)
addB=ttk.Button(frame,text="Div",command=div).grid(column=3,row=2)

for child in frame.winfo_children():
    child.grid_configure(padx=5,pady=5)

root.mainloop()
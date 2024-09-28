import tkinter as tk
from tkinter import ttk

root = tk.Tk()
root.geometry("500x200")
root.title("Calculator")

frame = ttk.Frame(root)
frame.pack(expand=True, fill=tk.BOTH, padx=10, pady=10)

# Configure columns for even distribution
for i in range(4):
    frame.columnconfigure(i, weight=1)

# Labels and Entry widgets for input
ttk.Label(frame, text="First Number").grid(column=0, row=0, sticky=tk.E)
n1 = ttk.Entry(frame)
n1.grid(column=1, row=0, columnspan=3, sticky=tk.W+tk.E)

ttk.Label(frame, text="Second Number").grid(column=0, row=1, sticky=tk.E)
n2 = ttk.Entry(frame)
n2.grid(column=1, row=1, columnspan=3, sticky=tk.W+tk.E)

# Label for displaying the result
result_label = ttk.Label(frame, text="Result: ")
result_label.grid(column=0, row=3, columnspan=4, pady=10, sticky=tk.W)

# Functions for calculator operations
def add():
    a = float(n1.get())
    b = float(n2.get())
    result_label.config(text="Result: " + str(a + b))

def sub():
    a = float(n1.get())
    b = float(n2.get())
    result_label.config(text="Result: " + str(a - b))

def mul():
    a = float(n1.get())
    b = float(n2.get())
    result_label.config(text="Result: " + str(a * b))

def div():
    a = float(n1.get())
    b = float(n2.get())
    if b != 0:
        result_label.config(text="Result: " + str(a / b))
    else:
        result_label.config(text="Result: Division by zero error")

# Calculator buttons with proper alignment and padding
buttons = [
    ("Add", add, 0),
    ("Sub", sub, 1),
    ("Mul", mul, 2),
    ("Div", div, 3),
]

for (text, command, col) in buttons:
    ttk.Button(frame, text=text, command=command).grid(column=col, row=2, padx=5, pady=5, sticky=tk.W+tk.E)

root.mainloop()

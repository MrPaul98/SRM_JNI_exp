# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "SAYANDIP PAUL"
__date__ = "$Nov 3, 2020 8:04:20 PM$"

from javax.swing import *
from java.awt import *
from student import Student
from com.ziclix.python.sql import zxJDBC
url = "jdbc:mysql://localhost:3306/dbStudent?zeroDateTimeBehavior=convertToNull"
user = "root"
password=""
driver ="com.mysql.jdbc.Driver" 
frame=JFrame("Application Details",defaultCloseOperation=JFrame.EXIT_ON_CLOSE,size=(300,400))
panel=JPanel();
frame.add(panel);
def react(event):
 index=lst.selectedIndex
 lbl4.setText(state[index])
 total=((int(phyfield.getText()))+(int(chefield.getText()))+(int(matfield.getText())))
 avg=(total/3)
 total1=str(total)
 if avg>=90:
    option="Application Selected with 75% sscholarship"
 elif avg<90 and avg>=80:
    option="Application selected with 50% scholarship"
 elif avg>=60 and avg<80:
    option="Application selected with no scholarship"
 else:
    option="Sorry not Selected"  
 with zxJDBC.connect(url, user, password, driver) as conn:
   with conn:
     with conn.cursor()as c:
       c.execute("insert into studentdetails values(?,?,?,?,?,?,?,?,?)",[namefield.getText(),numberfield.getText(),grp.getSelection().getActionCommand(),lbl4.getText(),int(phyfield.getText()),int(chefield.getText()),int(matfield.getText()),total,option])
 Students=Student(namefield.getText(),numberfield.getText(),grp.getSelection().getActionCommand(),lbl4.getText(),int(phyfield.getText()),int(chefield.getText()),int(matfield.getText()),total,option)
 Students.print();
 JOptionPane.showMessageDialog(frame,"Welcome "+namefield.getText()+"\n"+"Your Registration Number is"+numberfield.getText()+"\n"+"Gender is: "+grp.getSelection().getActionCommand()+"\n"+"State :"+lbl4.getText()+"\n"+"Total: "+total1+"\n"+"Status: "+option+"\n"+"Successfully Registered")
#def listselect(event):
#index=lst.getSelectedIndex
#lbl4.setText(state[index])
#t=JLabel("ENTER YOUR APPLICATION DETAILS",JLabel.CENTER)
#t.setBounds(200,200,200,200)
#panel.add(t)
namefield=JTextField("",20)
label=JLabel("Name: ")
#label.setBounds(60,20,40,20)
panel.add(label)
#namefield.setBounds(120,20,40,20)
panel.add(namefield)
numberfield=JTextField("",20)
label1=JLabel("Reg.No: ")
#label1.setBounds(60,20,40,20)
panel.add(label1)
#numberfield.setBounds(120,20,40,20)
panel.add(numberfield)
#panel.setLayout(BoxLayout(panel, BoxLayout.Y_AXIS))
#frame.add(panel)
rb1 = JRadioButton("Male")
rb1.setActionCommand("Male")

rb2 = JRadioButton("Female")
rb2.setActionCommand("Female")
frame.add(panel)
grp = ButtonGroup()
grp.add(rb1)
grp.add(rb2)
lbl1 = JLabel("Gender :")
#panel.add(Box.createVerticalGlue())
#panel.add(Box.createRigidArea(Dimension(0,10)))
panel.add(lbl1)
panel.add(rb1)
panel.add(rb2)
lbl2=JLabel("Languages Known: ")
box1 = JCheckBox("Tamil")
box2 = JCheckBox("English")
box3=JCheckBox("Hindi")
box4=JCheckBox("Telugu")
box5=JCheckBox("Physically Challenged")
panel.add(lbl2)
panel.add(box1)
panel.add(box2)
panel.add(box3)
panel.add(box4)
panel.add(box5)
lbl3=JLabel("Select State :")
lbl4=JLabel()
state=("AndhraPradesh","Telangana","TamilNadu","Maharashtra","Assam","Kerala","Karnataka","UttarPradesh","Madhya Pradesh","Punjab","Haryana","Himachal Pradesh","Orissa","WestBengal","Tripura","Sikkim","Nagaland","ArunachalPradesh","Rajasthan","Meghalaya","Goa","Gujarat","Bihar","Chhattisgarh","Jammu and Kashmir","Manipur","Jharkand","Mizoram","Uttranchal")
lst=JComboBox(state)
panel.add(lbl3)
panel.add(lst)
lbl5=JLabel("Enter the Mark details of (Phy/Che/Mat) Out of 100",JLabel.CENTER)
phylabel=JLabel("Physi")
phyfield=JTextField(20)
chelabel=JLabel("Chemi")
chefield=JTextField(20)
matlabel=JLabel("Maths")
matfield=JTextField(20)
panel.add(lbl5)
panel.add(phylabel)
panel.add(phyfield)

panel.add(chelabel)
panel.add(chefield)
panel.add(matlabel)
panel.add(matfield)
button=JButton("Submit",actionPerformed=react)
button.setBounds(60,20,40,20)
panel.add(button)
frame.getContentPane().add(panel,"Center")
frame.visible= True

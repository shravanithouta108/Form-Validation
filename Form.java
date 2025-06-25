function val() {
  var htno,name;
  htno=document.f1.t1.value;
  name=document.f1.t2.value;
   if(htno==''||isNaN(htno)) 
   {
    alert('Check Htno');
    document.f1.t1.value='';
  }
  else if(name==''|| name>=0)
  {
    alert('Check Name');
    document.f1.t2.value='';
    }

  else if(document.getElementById('c').value==0)
  {
    alert('Select Any Course from Following options')
  }
 else {
   amount();
 }
}

function amount()
{

  if(document.getElementById('c').value=='bsc')
  {
    document.f1.t3.value=2800;
  }
    else if (document.getElementById('c').value == 'bcom')
  {
    document.f1.t3.value = 2600;
  }
  else if (document.getElementById('c').value == 'bba')
  {
    document.f1.t3.value = 3000;
  }
  else if (document.getElementById('c').value == 'bca')
  {
    document.f1.t3.value = 3050;
  }
  document.getElementById('btn3').disabled=false;
}
function rep(){
  htno = document.f1.t1.value;
  name = document.f1.t2.value;
  course=document.getElementById('c').value;
  amount=document.f1.t3.value;
  
  document.write("<font color='blue'><h3><i>Print Form:</i></h3><br></font>");
  
  document.write("<font color='orange' size='5'<h1><u><center>Fee Receipt</center></u></h1><br><br></font>");

  document.write("Htno :"+htno+
  "<br>"
    
  );
document.writeln("Name :"+name+"<br>");
document.writeln("Course :"+course+"<br>");
document.write("Amount:"+amount+"<br><br>");

document.writeln("Note: Submit Above Receipt In The College and Pay Fee.");

}

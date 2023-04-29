
var text =  document.getElementById('evaluate')

function disp(value){
   text.value+=value??"";   
}

function clr(){
   text.value="";
}

function calculate(){
   let eval1 = eval(text.value)
    text.value=eval1
}
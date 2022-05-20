for (var i = 1; i <= 100; i++) {
    var multipleThree = false;
    var multipleFive = false;
    if(i%3==0) multipleThree=true;
    if(i%5==0) multipleFive=true;
    if(multipleFive==true && multipleThree==true) {
        console.log("ZeroCool"); 
        continue;
    }
    if(multipleFive==true) {
        console.log("Cool");
        continue;
    } 
    if(multipleThree==true) {
        console.log("Zero");
        continue;
    }
    console.log(i);
}
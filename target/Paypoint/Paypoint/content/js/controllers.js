/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


app.controller('MainCtrler',function($scope){
    
    $scope.welcomeHeading = "Welcome to Dinaar Paypoint";
    
    
});            

app.controller('TransferCtrl',function($scope,TransferService){
    
   $scope.benfname =  TransferService.transfer.bfname;
    
});      
app.controller('DashboardCtrl',function($scope){
    
    
    
});      
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


app.controller('MainCtrler', function ($scope) {

    $scope.welcomeHeading = "Welcome to Dinaar Paypoint";



});

app.controller('TransferCtrl', function ($scope, TransferService) {

    $scope.benfname = TransferService.transfer.bfname;

});
app.controller('DashboardCtrl', function ($scope) {
    $scope.accountBalance = {"Balance": 13400,
        "Commision": 2050,
        "UnsettledBalance": 500};
    $scope.trasnferRecord = [
        {"transferID": 1,
            "bankCode": 011,
            "accountNo": '3095905276',
            "amount": 500},
        {"transferID": 2,
            "bankCode": 011,
            "accountNo": '3095905276',
            "amount": 300500},
        {"transferID": 3,
            "bankCode": 011,
            "accountNo": '3095905276',
            "amount": 500500}];
    


}); 

app.controller('transferctrl',function($scope){
   $scope.transfer  ={"bankCode":'',"accountNo":'',"amount":'',"bphone":'',"sfname":'',"sphone":''};

});
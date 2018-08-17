/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var app = angular.module('PayPointClient',["ngRoute"]);
app.config(function($routeProvider){
    
    $routeProvider.when("/",{
        templateUrl:"/Paypoint/templetes/dashboard.html"
    });
    $routeProvider.when("/transfer",{
        templateUrl:"/Paypoint/templetes/transfer.html"
    }); 
    
    $routeProvider.when("/billpayment",{
        templateUrl:"/Paypoint/templetes/billpayment.html"
    }); 
    
    $routeProvider.when("/services",{
        templateUrl:"/Paypoint/templetes/services.html"
    }); 
    
    $routeProvider.when("/settings",{
        templateUrl:"/Paypoint/templetes/settings.html"
    }); 
    
 
    
});
app.controller('MainCtrler',function($scope){
    
    $scope.welcomeHeading = "Welcome to Dinaar Paypoint";
    
});            


//
//            window.sr = ScrollReveal();
//
//            sr.reveal(".showcase", {
//                Duration: '900000',
//                origin: 'left',
//                distance: '200px'
//
//            });
//            sr.reveal(".showcase-icons", {
//                Duration: '900000',
//                origin: 'right',
//                distance: '200px',
//
//            });
//            sr.reveal(".login-panel", {
//                Duration: '9000',
//                origin: 'bottom',
//                distance: '200px',
//
//            });
//            sr.reveal(".jumbotron p", {
//                Duration: '9000',
//                origin: 'left',
//                distance: '600px',
//            });
//            sr.reveal(".jumbotron h1", {
//                Duration: '9000',
//                origin: 'right',
//                distance: '200px',
//            });

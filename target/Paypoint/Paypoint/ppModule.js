/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var Paypoint = angular.module("DinaarMain",['ngRoute']);
Paypoint.config(function($routeProvider){
    
    $routeProvider.when("/",{
        templateUrl:"/Paypoint/Paypoint/dashboard/dashboard.html",
        controller: "dsController"
    });
    $routeProvider.when("/transfer",{
        templateUrl:"/Paypoint/Paypoint/transfer/transfer.html",
        controller: "trController"
    }); 
    
    $routeProvider.when("/billpayment",{
        templateUrl:"/Paypoint/Paypoint/billPayment/billpayment.html",
        controller:"bpController"
    }); 
    
});



var app=angular.module('myApp',[]);
app.controller('HelloCntr',function($scope){
$scope.hellomsg="Hello Message";
$scope.Employee= [{ ID:1,Name:'sam',Salary: '2000'},
					{ ID:2,Name:'sa',Salary: '20300'},
					{ ID:3,Name:'am',Salary: '20040'},
					{ ID:4,Name:'sai',Salary: '20400'}];
})
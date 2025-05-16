
function Validation()
{
	
	if(document.regForm.textUsername.value=="")
	{
		alert("Please Enter UserName");
		return false;
	}
	
	var password = document.regForm.textPassword.value;
    var regex = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/;
    
	if (!regex.test(password)) 
	{
	    alert("Password must be at least 8 characters long and contain at least one letter and one number.");
	    return false;
	}
	
	var email = document.regForm.textEmail.value;
	var emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/; 

	if (!emailRegex.test(email)) 
	{
	    alert("Please enter a valid email address.");
	    return false;
	}
	
	if((document.regForm.gender[0].checked==false) && (document.regForm.gender[1].checked==false))
	{
		alert("Please Select The Gender");
		return false;
	}
	
	if(document.regForm.age.selectedIndex==0)
	{
		alert("Please Select Age Group");
		return false;
	}
	
	if(document.regForm.term.checked==false)
	{
		alert("Accept Terms and Condition...");
		return false;
	}

}
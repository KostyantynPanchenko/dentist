		// Modal Image Gallery
		function onClick(element) {
		  document.getElementById("img01").src = element.src;
		  document.getElementById("modal01").style.display = "block";
		}

		//opens navbar in mobile mode
		function nav() {
			var x = document.getElementById("mobileNav");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}
		
		function showEdu(elem) {	
			var x = document.getElementById("education");		
			x.className = x.className.replace(" w3-hide", "");			
			elem.className += " w3-hide";						
		}
		
		function closeEdu(elem) {
			x = document.getElementById("eduMore");
			x.className = x.className.replace(" w3-hide", "");
			elem.className += " w3-hide";
		}
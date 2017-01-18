// Add smooth scrolling to all links in navbar + footer link
 $("#myNavbar a").on('click', function(event) {

	// Make sure this.hash has a value before overriding default behavior
	if (this.hash !== "") {

		// Prevent default anchor click behavior
		event.preventDefault();

		// Store hash
		var hash = this.hash;

		// Using jQuery's animate() method to add smooth page scroll
		// The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
		$('html, body').animate({
			scrollTop: $(hash).offset().top
		}, 900, function(){

		// Add hash (#) to URL when done scrolling (default click behavior)
		window.location.hash = hash;
		});
	}
 });
 
// Add year to copyright
var txt = $("#copyright").text();
var year = new Date().getFullYear().toString(); 
$("#copyright").text(txt + year);

// Initialize Google maps
function initMap() {
	var uluru = {lat: 50.455128, lng: 30.376952};
    
	var map = new google.maps.Map(document.getElementById('googleMap'), {
		zoom: 16,
		center: uluru
    });
    
	var marker = new google.maps.Marker({
        position: uluru,
        map: map
    });
}

// Modal Image Gallery
function onClick(element) {
	document.getElementById("img01").src = element.src;
	 document.getElementById("modal01").style.display = "block";
}

// Opens navbar in mobile mode
function nav() {
	var x = document.getElementById("mobileNav");
	if (x.className.indexOf("w3-show") == -1) {
		x.className += " w3-show";
	} else {
		x.className = x.className.replace(" w3-show", "");
	}
}

// Opens education section		
function showEdu(elem) {	
	var x = document.getElementById("education");		
	x.className = x.className.replace(" w3-hide", "");			
	elem.className += " w3-hide";						
}

// Closes education section		
function closeEdu(elem) {
	x = document.getElementById("eduMore");
	x.className = x.className.replace(" w3-hide", "");
	elem.className += " w3-hide";
}
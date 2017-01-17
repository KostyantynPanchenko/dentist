/*
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
	} // End if 
 });
 */

var myCenter = new google.maps.LatLng(50.455128, 30.376952);

function initialize() {
	var mapProp = {
		center: myCenter,
		zoom: 15,
		scrollwheel: false,
		draggable: false,
		mapTypeId: google.maps.MapTypeId.ROADMAP
	};

	var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);

	var marker = new google.maps.Marker({
		position: myCenter,
	});

	marker.setMap(map);
}

google.maps.event.addDomListener(window, 'load', initialize);

// Modal Image Gallery
function onClick(element) {
	document.getElementById("img01").src = element.src;
	 document.getElementById("modal01").style.display = "block";
}

// Change style of navbar on scroll
/*
window.onscroll = function() {myFunction()};
function myFunction() {
	var navbar = document.getElementById("myNavbar");
	if (document.body.scrollTop > 100 || document.documentElement.scrollTop > 100) {
		navbar.className = "w3-navbar" + " w3-card-2" + " w3-animate-top" + " w3-white";
	} else {
		navbar.className = navbar.className.replace(" w3-card-2 w3-animate-top w3-white", "");
	}
}
*/

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
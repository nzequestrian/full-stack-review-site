let xhr = new XMLHttpRequest();

xhr.onreadystatechange = function() {
	if (this.readyState == 4 && this.responseText == 200) {
		document.getElementById('newTag').innerHTML = xhr.responseText;
	}
};
xhr.open("GET", '../tags.html', true);
//setInterval(function(){
xhr.send();
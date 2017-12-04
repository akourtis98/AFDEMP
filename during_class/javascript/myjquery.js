$(document).ready(function(){
	$("#box").click(function(){
		var width = $("#box").width();
		if (width == 455){
			$("#box").animate({"width": "55px"}, "fast");
			$("#box").css("background-color", "black");
		}else{
			console.log("faf");
			$("#box").animate({"width": "455px"}, "fast");
			$("#box").css("background-color", "#85144b");
		}
	})
	$("#hoverme").hover(function() {
    $( "#hoverme" ).addClass( "chngColor1" );
  }, 		
     function () {
     $( "#hoverme" ).removeClass( "chngColor1" );
      $( "#hoverme" ).addClass( "chngColor" );
               }
            );
});
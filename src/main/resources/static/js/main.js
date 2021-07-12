function addToBasket(id) {
	window.location='/item/add/'+id;
$.ajax({
	url:'/item/add/'+id,
	type:"get",
	success(data){
		swal({
			title: "Article ajouté",
			text: "You clicked the button!",
			icon: "success",
		});
	},
	error(data){
		swal({
			title: "Article non ajouté",
			text: "You clicked the button!",
			icon: "danger",
		});
	}

})
}
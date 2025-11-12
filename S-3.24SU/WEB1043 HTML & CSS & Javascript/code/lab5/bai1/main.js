function display(button) {
    //cachs 2
    // var name = document.querySelector("pro").innerHTML;
    // document.querySelector("name").innerHTML = name;

    // var sl = document.querySelector("qty").value;
    // var price = document.querySelector("pro").getAttribute("data-price");
    // document.querySelector("amount").innerText = `$${sl*price}`;
    
    
    //cachs 3
    var name = document.querySelector(".pro").innerHTML;
    document.querySelector(".name").innerHTML = name;

    var sl = document.querySelector(".qty").value;
    var price = document.querySelector(".pro").getAttribute("data-price");
    document.querySelector(".amount").innerText = `$${sl*price}`;
}
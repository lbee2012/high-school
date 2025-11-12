const menus = document.querySelectorAll(".title");
const opentext = document.querySelectorAll(".myText");
menus.forEach((el) => {
    el.addEventListener("click",(e) => {
        console.log(el.nextElementSibling);
        remover();
        el.nextElementSibling.classList.toggle("active");
    })
})

function remover(){
    opentext.forEach((ele) => {
        ele.classList.remove("active");
    })
}
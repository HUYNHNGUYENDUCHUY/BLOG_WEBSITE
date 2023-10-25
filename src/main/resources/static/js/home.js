// $(document).ready(function (){
//
//
//
//     function handlePageSwitch(clickedElement, displayElement, text) {
//         // Hide all pages
//         $("#about-page, #home-page, #contact-page, #login-header").css("display", "none");
//
//         // Reset all button colors
//         $("#about, #home, #contact, #login").css({"background-color":"#65A5CC","color":"white"});
//
//         // Show the selected page
//         $(displayElement).css("display", "inline-block");
//
//         // Change the color of the clicked button
//         $(clickedElement).css({"background-color":"#EFF4FA","color":"#63A4D9"});
//
//         // Set the text of the clicked choice page
//         $("#click-choice-page").text(text);
//
//         // Show the taskbar
//         $("#taskbar").css("display","inline-block");
//     }
//
//     $("#about").click(function() {
//         handlePageSwitch("#about", "#about-page", "About");
//     });
//
//     $("#home").click(function() {
//         handlePageSwitch("#home", "#home-page", "");
//         $("#taskbar").css("display","none");  // Hide the taskbar for home page
//     });
//
//     $("#contact").click(function() {
//         handlePageSwitch("#contact", "#contact-page", "Contact");
//     });
//
//     $("#login").click(function() {
//         handlePageSwitch("#login", "#login-header", "Login");
//     });
//     $("#create-new-post").click(function (){
//         handlePageSwitch("#create-new-post","#create-post","Create Post")
//     })
//     $("#manage-post-control").click(function (){
//         handlePageSwitch("#manage-post-control","#manage-post","Manage Post")
//     })
//
//
//
//
// })

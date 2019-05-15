window.com_company_changefavicon_web_extension_ChangeFaviconExtension = function() {
    var self = this;

    self.changeFavicon = function (href) {
        var links = document.querySelectorAll("link[rel*='icon']");
        for (var i = 0; i < links.length; i++) {
            links[i].href = href;
        }
    }
}
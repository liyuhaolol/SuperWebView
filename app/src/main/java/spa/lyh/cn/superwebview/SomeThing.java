package spa.lyh.cn.superwebview;

import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liyuhao on 2017/11/29.
 */

public class SomeThing {
    public static String a = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n" +
            "        \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">\n" +
            "<head>\n" +
            "    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n" +
            "    <meta name=\"viewport\"\n" +
            "          content=\"width=device-width, maximum-scale=1, minimum-scale=1, user-scale=1\">\n" +
            "    <title>Document</title>\n" +
            "    <style type=\"text/css\">\n" +
            "\n" +
            "\t\tbody{\n" +
            "\t\t\tfont-family:\"Microsoft YaHei\",微软雅黑,\"MicrosoftJhengHei\",华文细黑,STHeiti,MingLiu;\n" +
            "\t\t\twidth:98%;\n" +
            "\t\t    height:auto;\n" +
            "\t\t    word-wrap: break-word;\n" +
            "\t\t}\n" +
            "\n" +
            "\t\timg{\n" +
            "\t\t    width:98%;\n" +
            "\t\t    height:auto;\n" +
            "\t\t}\n" +
            "\n" +
            "\t\tvideo{\n" +
            "\t\t   word-wrap: break-word;\n" +
            "\t\t   width:98%;\n" +
            "\t\t   height:auto;\n" +
            "\t\t}\n" +
            "\n" +
            "\t\taudio{\n" +
            "\t\t   word-wrap: break-word;\n" +
            "\t\t   width:98%;\n" +
            "\t\t   height:auto;\n" +
            "\t\t}\n" +
            "\n" +
            "\t\ta{\n" +
            "\t\t    word-wrap: break-word;\n" +
            "\t\t}\n" +
            "\n" +
            "\n" +
            "    </style>\n" +
            "\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<p>视频1</p>\n" +
            "<p>\n" +
            "    <video controls=\"controls\" loop=\"loop\" width=\"480\" height=\"400\"\n" +
            "           src=\"/newsyun/u/cms/www/201711/20171124151925595.mp4\" autoplay=\"autoplay\">\n" +
            "        <object classid=\"clsid:6bf52a52-394a-11d3-b153-00c04f79faa6\" width=\"480\" height=\"400\">\n" +
            "            <param name=\"url\" value=\"/newsyun/u/cms/www/201711/20171124151925595.mp4\">\n" +
            "            <param name=\"autostart\" value=\"true\">\n" +
            "            <param name=\"uimode\" value=\"full\">\n" +
            "            <embed type=\"application/x-mplayer2\"\n" +
            "                   src=\"/newsyun/u/cms/www/201711/20171124151925595.mp4\" width=\"480\" height=\"400\"\n" +
            "                   autostart=\"true\" uimode=\"full\"\n" +
            "                   pluginspage=\"http://microsoft.com/windows/mediaplayer/en/download/\"></embed>\n" +
            "        </object>\n" +
            "    </video>\n" +
            "    <br></p>\n" +
            "<p>音频1</p>\n" +
            "<p>\n" +
            "    <audio controls=\"controls\" loop=\"loop\" style=\"width:480px;height:400px;\"\n" +
            "           src=\"/newsyun/u/cms/www/201711/20171124143214586.mp3\" autoplay=\"autoplay\">\n" +
            "        <object classid=\"clsid:6bf52a52-394a-11d3-b153-00c04f79faa6\"\n" +
            "                style=\"width:480px;height:400px;\">\n" +
            "            <param name=\"url\" value=\"/newsyun/u/cms/www/201711/20171124143214586.mp3\">\n" +
            "            <param name=\"autostart\" value=\"true\">\n" +
            "            <param name=\"uimode\" value=\"full\">\n" +
            "            <embed type=\"application/x-mplayer2\"\n" +
            "                   src=\"/newsyun/u/cms/www/201711/20171124143214586.mp3\" autostart=\"true\"\n" +
            "                   uimode=\"full\" pluginspage=\"http://microsoft.com/windows/mediaplayer/en/download/\"\n" +
            "                   style=\"width:480px;height:400px;\"></embed>\n" +
            "        </object>\n" +
            "    </audio>\n" +
            "</p>\n" +
            "<p>\n" +
            "    段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落段落</p>\n" +
            "<p>视频2</p>\n" +
            "<p>\n" +
            "    <video controls=\"controls\" loop=\"loop\" width=\"480\" height=\"400\"\n" +
            "           src=\"/newsyun/u/cms/www/201711/20171124151938293.mp4\" autoplay=\"autoplay\">\n" +
            "        <object classid=\"clsid:6bf52a52-394a-11d3-b153-00c04f79faa6\" width=\"480\" height=\"400\">\n" +
            "            <param name=\"url\" value=\"/newsyun/u/cms/www/201711/20171124151938293.mp4\">\n" +
            "            <param name=\"autostart\" value=\"true\">\n" +
            "            <param name=\"uimode\" value=\"full\">\n" +
            "            <embed type=\"application/x-mplayer2\"\n" +
            "                   src=\"/newsyun/u/cms/www/201711/20171124151938293.mp4\" width=\"480\" height=\"400\"\n" +
            "                   autostart=\"true\" uimode=\"full\"\n" +
            "                   pluginspage=\"http://microsoft.com/windows/mediaplayer/en/download/\"></embed>\n" +
            "        </object>\n" +
            "    </video>\n" +
            "    <br></p>\n" +
            "<p><br></p>\n" +
            "<p>音频2</p>\n" +
            "<p><br></p>\n" +
            "<p>\n" +
            "    <audio controls=\"controls\" loop=\"loop\" style=\"width:480px;height:400px;\"\n" +
            "           src=\"/newsyun/u/cms/www/201711/20171124153243473.mp3\" autoplay=\"autoplay\">\n" +
            "        <object classid=\"clsid:6bf52a52-394a-11d3-b153-00c04f79faa6\"\n" +
            "                style=\"width:480px;height:400px;\">\n" +
            "            <param name=\"url\" value=\"/newsyun/u/cms/www/201711/20171124153243473.mp3\">\n" +
            "            <param name=\"autostart\" value=\"true\">\n" +
            "            <param name=\"uimode\" value=\"full\">\n" +
            "            <embed type=\"application/x-mplayer2\"\n" +
            "                   src=\"/newsyun/u/cms/www/201711/20171124153243473.mp3\" autostart=\"true\"\n" +
            "                   uimode=\"full\" pluginspage=\"http://microsoft.com/windows/mediaplayer/en/download/\"\n" +
            "                   style=\"width:480px;height:400px;\"></embed>\n" +
            "        </object>\n" +
            "    </audio>\n" +
            "    <br></p>\n" +
            "<p><br></p>\n" +
            "<p>外链视频</p>\n" +
            "<p>\n" +
            "    <video controls=\"controls\" loop=\"loop\" width=\"480\" height=\"400\"\n" +
            "           src=\"http://10.9.1.14/relite/flv/170525/bc2a74e0uVHbjMBb.ipad.mp4\" autoplay=\"autoplay\">\n" +
            "        <object classid=\"clsid:6bf52a52-394a-11d3-b153-00c04f79faa6\" width=\"480\" height=\"400\">\n" +
            "            <param name=\"url\" value=\"http://10.9.1.14/relite/flv/170525/bc2a74e0uVHbjMBb.ipad.mp4\">\n" +
            "            <param name=\"autostart\" value=\"true\">\n" +
            "            <param name=\"uimode\" value=\"full\">\n" +
            "            <embed type=\"application/x-mplayer2\"\n" +
            "                   src=\"http://10.9.1.14/relite/flv/170525/bc2a74e0uVHbjMBb.ipad.mp4\" width=\"480\"\n" +
            "                   height=\"400\" autostart=\"true\" uimode=\"full\"\n" +
            "                   pluginspage=\"http://microsoft.com/windows/mediaplayer/en/download/\"></embed>\n" +
            "        </object>\n" +
            "    </video>\n" +
            "</p>\n" +
            "</body>\n" +
            "\n" +
            "<script type=\"text/javascript\" src=\"file:///android_asset/js/jquery.min.js\"></script>\n" +
            "<script type=\"text/javascript\" src=\"file:///android_asset/js/jquery.lazyload.min.js\"></script>\n" +
            "<script type=\"text/javascript\">\n" +
            "\n" +
            "\t$(document).ready(function() {\n" +
            "\n" +
            "        //$(\".container\").append(\"我是追加的文本内容\");\n" +
            "\n" +
            "        var imgs = document.getElementsByTagName('img');\n" +
            "           for (var i = 0; i < imgs.length; i++) {\n" +
            "               imgs[i].index = i;\n" +
            "               imgs[i].onclick = function(){\n" +
            "                   var j = this.index;\n" +
            "    　               //alert(\"元素索引为\" +this.index);\n" +
            "                     window.imagelistener.openImage(this.src,this.index);\n" +
            "          }\n" +
            "      \t}\n" +
            "\n" +
            "      });\n" +
            "\n" +
            "\t\tString.prototype.startWith = function(compareStr){\n" +
            "\t\t    return this.indexOf(compareStr) == 0;\n" +
            "\t\t}\n" +
            "\n" +
            "\t\t$(\"img\").each(function() {\n" +
            "\t\t    $(this).attr(\"data-original\",$(this).attr(\"src\"));\n" +
            "\t\t    $(this).removeAttr(\"src\");\n" +
            "\t\t}); \n" +
            "\n" +
            "        $(\"img\").lazyload({\n" +
            "              effect : \"fadeIn\",\n" +
            "              placeholder:\"file:///android_asset/pic_16_9.png\"\n" +
            "        });\n" +
            "\n" +
            "\n" +
            "</script>\n" +
            "\n" +
            "</html>";


    /**
     * @param htmlStr  html文本
     * @param searchTag  要修改的目标标签
     * @param searchAttrib  目标标签中的属性
     */
    public static String updateHtmlTag(String htmlStr, String searchTag,String searchAttrib,String startStr , String endStr) {
        String regxpForTag ="<\\s*" + searchTag + "\\s+([^>]*)\\s*>";
        String regxpForTagAttrib = searchAttrib;// + "\\s*=\\s*[\"|']http://([^\"|']+)[\"|']";//"=[\"|']([^[\"|']]+)[\"|']";
        Pattern patternForTag = Pattern.compile(regxpForTag);
        Pattern patternForAttrib = Pattern.compile(regxpForTagAttrib);
        Matcher matcherForTag = patternForTag.matcher(htmlStr);
        StringBuffer sb = new StringBuffer();
        boolean result = matcherForTag.find();
        while (result) {
            StringBuffer sbreplace = new StringBuffer("<"+searchTag +" ");
            //System.out.println(matcherForTag.group(1));
            Log.e("输出了",matcherForTag.group(1));

            Matcher matcherForAttrib = patternForAttrib.matcher(matcherForTag
                    .group(1));

            if (matcherForAttrib.find()) {
                //System.out.println("ll"+matcherForAttrib.group(1));
                Log.e("输出了",matcherForAttrib.group(0));
                matcherForAttrib.appendReplacement(sbreplace, startStr);
            }
//            matcherForTag.appendReplacement(sb, sbreplace.toString());
            matcherForAttrib.appendTail(sbreplace);
            matcherForTag.appendReplacement(sb, sbreplace.toString()+">");
            result = matcherForTag.find();
        }
        matcherForTag.appendTail(sb);
        return sb.toString();
    }
}

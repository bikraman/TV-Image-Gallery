package com.beniezsche.tvimagegallery.data



/**
 * Ideally this class is where you define your data sources for the application (APIs and DBs)
 * but since in this case the data (in our case image urls) were already provided I just created a simple static class
 **/
class ImageData {

    companion object {

        private val imageList = arrayListOf(
            "https://image.tmdb.org/t/p/w500/v4uvGFAkKuYfyKLGZnYj6l47ERQ.jpg",
            "https://image.tmdb.org/t/p/w500/gKkl37BQuKTanygYQG1pyYgLVgf.jpg",
            "https://image.tmdb.org/t/p/w500/4xJd3uwtL1vCuZgEfEc8JXI9Uyx.jpg",
            "https://image.tmdb.org/t/p/w500/hkxxMIGaiCTmrEArK7J56JTKUlB.jpg",
            "https://image.tmdb.org/t/p/w500/gho58bYmw9juYXmUSHRJKOngJGn.jpg",
            "https://image.tmdb.org/t/p/w500/y3AeW200hqGLxoPyHMDHpzudylz.jpg",
            "https://image.tmdb.org/t/p/w500/kDp1vUBnMpe8ak4rjgl3cLELqjU.jpg",
            "https://image.tmdb.org/t/p/w500/uuA01PTtPombRPvL9dvsBqOBJWm.jpg",
            "https://image.tmdb.org/t/p/w500/e1J2oNzSBdou01sUvriVuoYp0pJ.jpg",
            "https://image.tmdb.org/t/p/w500/dJaIw8OgACelojyV6YuVsOhtTLO.jpg",
            "https://image.tmdb.org/t/p/w500/esLooowdB92I3dVI3ENlPPpTuWT.jpg",
            "https://image.tmdb.org/t/p/w500/zK2sFxZcelHJRPVr242rxy5VK4T.jpg",
            "https://image.tmdb.org/t/p/w500/hu40Uxp9WtpL34jv3zyWLb5zEVY.jpg",
            "https://image.tmdb.org/t/p/w500/kScdQEwS9jPEdnO23XjGAtaoRcT.jpg",
            "https://image.tmdb.org/t/p/w500/7qxG0zyt29BI0IzFDfsps62kbQi.jpg",
            "https://image.tmdb.org/t/p/w500/nBVYp2xxx2R02n21EGlDky8CgWR.jpg",
            "https://image.tmdb.org/t/p/w500/zDi2U7WYkdIoGYHcYbM9X5yReVD.jpg",
            "https://image.tmdb.org/t/p/w500/iy08wTsqcWYT2PFTEWFYcxepLeB.jpg",
            "https://image.tmdb.org/t/p/w500/tpiqEVTLRz2Mq7eLq5DT8jSrp71.jpg",
            "https://image.tmdb.org/t/p/w500/hU1Q9YVzdYhokr8a9gLywnSUMlN.jpg",
            "https://image.tmdb.org/t/p/w500/7Md3nuV0ZprBTnkdR3OrUCEsrSP.jpg",
            "https://image.tmdb.org/t/p/w500/rULWuutDcN5NvtiZi4FRPzRYWSh.jpg",
            "https://image.tmdb.org/t/p/w500/ldfCF9RhR40mppkzmftxapaHeTo.jpg",
            "https://image.tmdb.org/t/p/w500/eVWHzm6bL4ybAuRLqA10Qo7ACfN.jpg",
            "https://image.tmdb.org/t/p/w500/8Gxv8gSFCU0XGDykEGv7zR1n2ua.jpg",
            "https://image.tmdb.org/t/p/w500/2iQoSPyAGHseY5NhMM28orLkxjq.jpg",
            "https://image.tmdb.org/t/p/w500/fdZpvODTX5wwkD0ikZNaClE4AoW.jpg",
            "https://image.tmdb.org/t/p/w500/bXi6IQiQDHD00JFio5ZSZOeRSBh.jpg",
            "https://image.tmdb.org/t/p/w500/mMA1qhBFgZX8O36qPPTC016kQl1.jpg",
            "https://image.tmdb.org/t/p/w500/xeEw3eLeSFmJgXZzmF2Efww0q3s.jpg",
            "https://image.tmdb.org/t/p/w500/fiVW06jE7z9YnO4trhaMEdclSiC.jpg",
            "https://image.tmdb.org/t/p/w500/d5NXSklXo0qyIYkgV94XAgMIckC.jpg",
            "https://image.tmdb.org/t/p/w500/ydC8ubFXQfkPJDhkduMhbE9mTz7.jpg",
            "https://image.tmdb.org/t/p/w500/pQYHouPsDw32FhDLr7E3jmw0WTk.jpg",
            "https://image.tmdb.org/t/p/w500/iuFNMS8U5cb6xfzi51Dbkovj7vM.jpg",
            "https://image.tmdb.org/t/p/w500/cjLsuP75UDlRdJVMXzXg3TJ4umX.jpg",
            "https://image.tmdb.org/t/p/w500/sh7Rg8Er3tFcN9BpKIPOMvALgZd.jpg",
            "https://image.tmdb.org/t/p/w500/pKaA8VvfkNfEMUPMiiuL5qSPQYy.jpg",
            "https://image.tmdb.org/t/p/w500/8QVDXDiOGHRcAD4oM6MXjE0osSj.jpg",
            "https://image.tmdb.org/t/p/w500/upKD8UbH8vQ798aMWgwMxV8t4yk.jpg",
            "https://image.tmdb.org/t/p/w500/gAEUXC37vl1SnM7PXsHTF23I2vq.jpg",
            "https://image.tmdb.org/t/p/w500/rtosxP5sXuoRFPH4sVbMccLIPiV.jpg",
            "https://image.tmdb.org/t/p/w500/xlIQf4y9eB14iYzNN142tROIWON.jpg",
            "https://image.tmdb.org/t/p/w500/e843ZAdn3f5R7SFTRIqoV7Ttk91.jpg",
            "https://image.tmdb.org/t/p/w500/6Bd17axAG0qJ6YIU3SoootXV0Cz.jpg",
            "https://image.tmdb.org/t/p/w500/74xTEgt7R36Fpooo50r9T25onhq.jpg",
            "https://image.tmdb.org/t/p/w500/xbKFv4KF3sVYuWKllLlwWDmuZP7.jpg",
            "https://image.tmdb.org/t/p/w500/6FfCtAuVAW8XJjZ7eWeLibRLWTw.jpg",
            "https://image.tmdb.org/t/p/w500/xtPPOPTad1qopK6uDe3VlYUa22o.jpg",
            "https://image.tmdb.org/t/p/w500/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg",
            "https://image.tmdb.org/t/p/w500/rktDFPbfHfUbArZ6OOOKsXcv0Bm.jpg",
            "https://image.tmdb.org/t/p/w500/sHJ2OIgpcpSmhqXkuSWxZ3nwg1S.jpg",
            "https://image.tmdb.org/t/p/w500/vdTvwykMWvVgdaViBVRh8IFTku5.jpg",
            "https://image.tmdb.org/t/p/w500/fSRb7vyIP8rQpL0I47P3qUsEKX3.jpg",
            "https://image.tmdb.org/t/p/w500/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
            "https://image.tmdb.org/t/p/w500/uXUs1fwSuE06LgYETw2mi4JxQvc.jpg",
            "https://image.tmdb.org/t/p/w500/wJmWliwXIgZOCCVOcGRBhce7xPS.jpg",
            "https://image.tmdb.org/t/p/w500/qsdjk9oAKSQMWs0Vt5Pyfh6O4GZ.jpg",
            "https://image.tmdb.org/t/p/w500/A7YPhQKdcr6XB1kCUdS4tHifYWd.jpg",
            "https://image.tmdb.org/t/p/w500/8Nw5v7wPfa2FwbKyx61K2nIBcKa.jpg",
            "https://image.tmdb.org/t/p/w500/u3aPmYOkd8GclXg8nTvKQ4w1f7L.jpg",
            "https://image.tmdb.org/t/p/w500/qvktm0BHcnmDpul4Hz01GIazWPr.jpg",
            "https://image.tmdb.org/t/p/w500/gMB8vgHu2lcyzv1fyptD6drHmJd.jpg",
            "https://image.tmdb.org/t/p/w500/6WBeq4fCfn7AN0o21W9qNcRF2l9.jpg",
            "https://image.tmdb.org/t/p/w500/rzRwTcFvttcN1ZpX2xv4j3tSdJu.jpg",
            "https://image.tmdb.org/t/p/w500/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg",
            "https://image.tmdb.org/t/p/w500/qhb1qOilapbapxWQn9jtRCMwXJF.jpg",
            "https://image.tmdb.org/t/p/w500/AtsgWhDnHTq68L0lLsUrCnM7TjG.jpg",
            "https://image.tmdb.org/t/p/w500/sw4M0jLT04FM1p3C2XQ3il50wgV.jpg",
            "https://image.tmdb.org/t/p/w500/rGfGfgL2pEPCfhIvqHXieXFn7gp.jpg",
            "https://image.tmdb.org/t/p/w500/fnbjcRDYn6YviCcePDnGdyAkYsB.jpg",
            "https://image.tmdb.org/t/p/w500/zj8ongFhtWNsVlfjOGo8pSr7PQg.jpg",
            "https://image.tmdb.org/t/p/w500/oYuLEt3zVCKq57qu2F8dT7NIa6f.jpg",
            "https://image.tmdb.org/t/p/w500/jFK2ZLQUzo9pea0jfMCHDfvWsx7.jpg",
            "https://image.tmdb.org/t/p/w500/vfrQk5IPloGg1v9Rzbh2Eg3VGyM.jpg",
            "https://image.tmdb.org/t/p/w500/k68nPLbIST6NP96JmTxmZijEvCA.jpg",
            "https://image.tmdb.org/t/p/w500/d5iIlFn5s0ImszYzBPb8JPIfbXD.jpg",
            "https://image.tmdb.org/t/p/w500/cqxg1CihGR5ge0i1wYXr4Rdeppu.jpg",
            "https://image.tmdb.org/t/p/w500/imekS7f1OuHyUP2LAiTEM0zBzUz.jpg",
        )

        fun getImages(): ArrayList<String> {
            return imageList;
        }
    }

}
package project.sk.db;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Functions extends dbConnection{
    public static Color darkBlue = new Color(7, 75, 155);
    public static Color lightGray = new Color(137, 132, 132);
    public static Color maroon = new Color(204, 27, 40);
    public static Color lightBlue = new Color(89, 131, 187);
    public static Color Blue = new Color(39, 62, 125);
    public static Color cyan = new Color(233, 255, 254);
    public static Color lighterBlue = new Color(221, 227, 236);
    public static Color lighterGray = new Color(162, 162, 162);

    public static void main(String[] args) {
        Functions functions = new Functions();
        functions.mainFrame();
    }

    public void mainFrame() {
        JFrame frame = new JFrame("SK Profiling System");
        frame.setSize(1350, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.WHITE);
        home(frame);
        frame.setVisible(true);
    }

    public static void home(JFrame frame){
        frame.getContentPane().removeAll();
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setPreferredSize(new Dimension(1350, 2180));

        JPanel imagePanel2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        imagePanel2.setBounds(30, 10, 180, 90);
        imagePanel2.setOpaque(false);
        contentPanel.add(imagePanel2);

        JLabel home = new JLabel("Home");
        home.setBounds(280, 10, 180, 90);
        home.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(home, frame, "home");
        contentPanel.add(home);

        JLabel manag = new JLabel("Profile Management");
        manag.setBounds(400, 10, 300, 90);
        manag.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(manag, frame, "profileManagement");
        contentPanel.add(manag);

        JLabel visual = new JLabel("Data Visualization");
        visual.setBounds(680, 10, 300, 90);
        visual.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(visual, frame, "dataVisualization");
        contentPanel.add(visual);

        JLabel admin = new JLabel("Administration");
        admin.setBounds(950, 10, 300, 90);
        admin.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(admin, frame, "admin");
        contentPanel.add(admin);

        JPanel homePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\1111.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        homePanel.setBounds(0, 105, 1350, 613);
        contentPanel.add(homePanel);
        
        JPanel profilingInfo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM!.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        profilingInfo.setBounds(0, 718, 1345, 510);
        contentPanel.add(profilingInfo);
        
        JPanel skInfo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (2).png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        skInfo.setBounds(0, 1228, 1325, 352);
        contentPanel.add(skInfo);
                
        JButton openFile1 = new JButton("OPEN FILE");
        openFile1.setBounds(210, 1850, 92, 24);
        openFile1.setBackground(Color.WHITE);
        openFile1.setForeground(Blue);
        openFile1.setFont(new Font("Arial", Font.BOLD, 10));
        openFile1.addActionListener(e->{
             String url = "https://drive.google.com/file/d/1tOW2SYxmlBH-6ynFlrWx0-vaZTRljFEW/view";
            openWebPage(url);
        });
        contentPanel.add(openFile1);
        
        JButton openFile2 = new JButton("OPEN FILE");
        openFile2.setBounds(620, 1850, 92, 24);
        openFile2.setBackground(Color.WHITE);
        openFile2.setForeground(Blue);
        openFile2.setFont(new Font("Arial", Font.BOLD, 10));
        openFile2.addActionListener(e->{
             String url = "https://drive.google.com/file/d/1X-3ib_s_fJZEBKl3NiNR6bn0xPvnsoK_/view";
            openWebPage(url);
        });
        contentPanel.add(openFile2);
        
        JButton openFile3 = new JButton("OPEN FILE");
        openFile3.setBounds(1010, 1850, 92, 24);
        openFile3.setBackground(Color.WHITE);
        openFile3.setForeground(Blue);
        openFile3.setFont(new Font("Arial", Font.BOLD, 10));
        openFile3.addActionListener(e->{
             String url = "https://drive.google.com/file/d/1HGCQWuwAwYM_KNYS-NkkBGTBoCSpwXOr/view";
            openWebPage(url);
        });
        contentPanel.add(openFile3);
        
        JPanel news = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (4).png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        news.setBounds(0, 1580, 1325, 401);
        contentPanel.add(news);
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.revalidate();
        frame.repaint();
    }
    
    public static void profileManagement(JFrame frame) {
        frame.getContentPane().removeAll();
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setPreferredSize(new Dimension(1350, 720));
                        
        JPanel imagePanel2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        imagePanel2.setBounds(30, 10, 180, 90);
        imagePanel2.setOpaque(false);
        contentPanel.add(imagePanel2);

        JLabel home = new JLabel("Home");
        home.setBounds(280, 10, 180, 90);
        home.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(home, frame, "home");
        contentPanel.add(home);

        JLabel manag = new JLabel("Profile Management");
        manag.setBounds(400, 10, 300, 90);
        manag.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(manag, frame, "profileManagement");
        contentPanel.add(manag);

        JLabel visual = new JLabel("Data Visualization");
        visual.setBounds(680, 10, 300, 90);
        visual.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(visual, frame, "dataVisualization");
        contentPanel.add(visual);

        JLabel admin = new JLabel("Administration");
        admin.setBounds(950, 10, 300, 90);
        admin.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(admin, frame, "admin");
        contentPanel.add(admin);
                
        JPanel header = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (9).png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        header.setBounds(0, 104, 1335, 238);
        header.setOpaque(false);
        contentPanel.add(header);
        
        JLabel add = new JLabel("ADD");
        add.setBounds(210, 520, 350, 50);
        add.setFont(new Font("Arial", Font.PLAIN, 38));
        add.setForeground(darkBlue);
        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                add.setFont(new Font("Arial", Font.BOLD, 38));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                add.setFont(new Font("Arial", Font.PLAIN, 38));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                addKabataan(frame);
            }
        });
        contentPanel.add(add);
        
        JLabel update = new JLabel("UPDATE");
        update.setBounds(445, 520, 350, 50);
        update.setFont(new Font("Arial", Font.PLAIN, 38));
        update.setForeground(darkBlue);
        update.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                update.setFont(new Font("Arial", Font.BOLD, 38));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                update.setFont(new Font("Arial", Font.PLAIN, 38));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                updateKabataan(frame);
            }
        });
        contentPanel.add(update);
        
        JLabel search = new JLabel("SEARCH");
        search.setBounds(715, 520, 350, 50);
        search.setFont(new Font("Arial", Font.PLAIN, 38));
        search.setForeground(darkBlue);
        search.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                search.setFont(new Font("Arial", Font.BOLD, 38));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                search.setFont(new Font("Arial", Font.PLAIN, 38));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                searchKabataan(frame);
            }
        });
        contentPanel.add(search);
           
        JLabel retrieve = new JLabel("RETRIEVE");
        retrieve.setBounds(970, 520, 350, 50);
        retrieve.setFont(new Font("Arial", Font.PLAIN, 38));
        retrieve.setForeground(darkBlue);
        retrieve.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                retrieve.setFont(new Font("Arial", Font.BOLD, 38));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                retrieve.setFont(new Font("Arial", Font.PLAIN, 38));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                retrieveKabataan(frame);
            }
        });
        contentPanel.add(retrieve);
        
        JPanel choice = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (7).png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        choice.setBounds(0, 335, 1325, 345);
        choice.setOpaque(false);
        contentPanel.add(choice);
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.revalidate();
        frame.repaint();
    }
    
        public static void addKabataan(JFrame frame) {
            frame.getContentPane().removeAll();        
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(null);
            contentPanel.setBackground(Color.WHITE);
            contentPanel.setPreferredSize(new Dimension(1350, 1500));

            personalInfo(frame);

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.revalidate();
            frame.repaint();    
        }

        public static void personalInfo(JFrame frame) {
            frame.getContentPane().removeAll();        
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(null);
            contentPanel.setBackground(Color.WHITE);
            contentPanel.setPreferredSize(new Dimension(1350, 1600));

            JPanel imagePanel2 = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            imagePanel2.setBounds(30, 10, 180, 90);
            imagePanel2.setOpaque(false);
            contentPanel.add(imagePanel2);

            JLabel home = new JLabel("Home");
            home.setBounds(280, 10, 180, 90);
            home.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(home, frame, "home");
            contentPanel.add(home);

            JLabel manag = new JLabel("Profile Management");
            manag.setBounds(400, 10, 300, 90);
            manag.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(manag, frame, "profileManagement");
            contentPanel.add(manag);

            JLabel visual = new JLabel("Data Visualization");
            visual.setBounds(680, 10, 300, 90);
            visual.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(visual, frame, "dataVisualization");
            contentPanel.add(visual);

            JLabel admin = new JLabel("Administration");
            admin.setBounds(950, 10, 300, 90);
            admin.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(admin, frame, "admin");
            contentPanel.add(admin);

            JPanel header = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (14).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            header.setBounds(0, 104, 1335, 238);
            header.setOpaque(false);
            contentPanel.add(header);       

            JPanel pageNum = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (19).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            pageNum.setBounds(340, 370, 632, 58);
            pageNum.setOpaque(false);
            contentPanel.add(pageNum);

            JLabel personalInformation = new JLabel("PERSONAL INFORMATION");
            personalInformation.setBounds(340, 330, 700, 300);
            personalInformation.setFont(new Font("Arial", Font.BOLD, 44));
            contentPanel.add(personalInformation);

            JLabel lnamelabel = new JLabel("Lastname");
            lnamelabel.setBounds(340, 525, 250, 50);
            lnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(lnamelabel);

            JTextField lname = new JTextField("Type Here");
            lname.setBounds(340, 575, 632, 50);
            lname.setFont(new Font("Arial", Font.BOLD, 18));
            lname.setForeground(lighterGray);
            lname.setBackground(lighterBlue);
            lname.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (lname.getText().equals("Type Here")) {
                        lname.setText("");
                        lname.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (lname.getText().isEmpty()) {
                        lname.setForeground(lighterGray);
                        lname.setText("Type Here");
                    }
                }
                
                String lastName = lname.getText();
            });

            contentPanel.add(lname);

            JLabel fnamelabel = new JLabel("Firstname");
            fnamelabel.setBounds(340, 625, 250, 50);
            fnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(fnamelabel);

            JTextField fname = new JTextField("Type Here");
            fname.setBounds(340, 675, 632, 50);
            fname.setFont(new Font("Arial", Font.BOLD, 18));
            fname.setForeground(lighterGray);
            fname.setBackground(lighterBlue);
            fname.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (fname.getText().equals("Type Here")) {
                        fname.setText("");
                        fname.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (fname.getText().isEmpty()) {
                        fname.setForeground(lighterGray);
                        fname.setText("Type Here");
                    }
                }
                String firstName = fname.getText();
            });

            contentPanel.add(fname);

            JLabel mnamelabel = new JLabel("Middle Name");
            mnamelabel.setBounds(340, 725, 250, 50);
            mnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(mnamelabel);

            JTextField mname = new JTextField("Type Here");
            mname.setBounds(340, 775, 632, 50);
            mname.setFont(new Font("Arial", Font.BOLD, 18));
            mname.setForeground(lighterGray);
            mname.setBackground(lighterBlue);
            mname.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (mname.getText().equals("Type Here")) {
                        mname.setText("");
                        mname.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (mname.getText().isEmpty()) {
                        mname.setForeground(lighterGray);
                        mname.setText("Type Here");
                    }
                }
                
                String midName = mname.getText();
            });

            contentPanel.add(mname);

            JLabel enamelabel = new JLabel("Extension Name");
            enamelabel.setBounds(340, 825, 250, 50);
            enamelabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(enamelabel);

            JTextField ename = new JTextField("Type Here");
            ename.setBounds(340, 875, 632, 50);
            ename.setFont(new Font("Arial", Font.BOLD, 18));
            ename.setForeground(lighterGray);
            ename.setBackground(lighterBlue);
            ename.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (ename.getText().equals("Type Here")) {
                        ename.setText("");
                        ename.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (ename.getText().isEmpty()) {
                        ename.setForeground(lighterGray);
                        ename.setText("Type Here");
                    }
                }
                
                String extname = ename.getText();
            });

            contentPanel.add(ename);

            JLabel dobLabel = new JLabel("Date of Birth (mm/dd/yyyy)");
            dobLabel.setBounds(340, 925, 250, 50);
            dobLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(dobLabel);

            JTextField dob = new JTextField("Type Here");
            dob.setBounds(340, 975, 632, 50);
            dob.setFont(new Font("Arial", Font.BOLD, 18));
            dob.setForeground(lighterGray);
            dob.setBackground(lighterBlue);
            dob.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (dob.getText().equals("Type Here")) {
                        dob.setText("");
                        dob.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (dob.getText().isEmpty()) {
                        dob.setForeground(lighterGray);
                        dob.setText("Type Here");
                    }
                }
                
                String bday = dob.getText();
            });

            contentPanel.add(dob);

            JLabel citLabel = new JLabel("Citizenship");
            citLabel.setBounds(340, 1025, 250, 50);
            citLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(citLabel);

            JTextField cit = new JTextField("Type Here");
            cit.setBounds(340, 1075, 632, 50);
            cit.setFont(new Font("Arial", Font.BOLD, 18));
            cit.setForeground(lighterGray);
            cit.setBackground(lighterBlue);
            cit.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (cit.getText().equals("Type Here")) {
                        cit.setText("");
                        cit.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (cit.getText().isEmpty()) {
                        cit.setForeground(lighterGray);
                        cit.setText("Type Here");
                    }
                }
                
                String citizenship = cit.getText();
            });

            contentPanel.add(cit);

            JLabel civilStatLabel = new JLabel("Civil Status");
            civilStatLabel.setBounds(340, 1125, 250, 50);
            civilStatLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(civilStatLabel);

            String[] civiloptions = {"Choose", "Single", "Married", "Divorced", "Widowed"};
            JComboBox<String> civilDrop = new JComboBox<>(civiloptions);
            civilDrop.setBounds(340, 1175, 632, 50);
            civilDrop.setFont(new Font("Arial", Font.BOLD, 18));
            civilDrop.setBackground(lighterBlue);
            contentPanel.add(civilDrop);
            
            String civil = (String) civilDrop.getSelectedItem();

            JLabel youthClassLabel = new JLabel("Youth Classification");
            youthClassLabel.setBounds(340, 1225, 250, 50);
            youthClassLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(youthClassLabel);

            String[] youthClassoptions = {"Choose", "[ISY] In-School Youth", "[OSY] Out-of-School Youth", "[NEET] Not in Education, Employment, or Training", "[WY] Working Youth",
                "[WISY] Working-In-School Youth", "[PWD] Persons With Disability", "[IP] Indigenous Peoples"};
            JComboBox<String> youthClassDrop = new JComboBox<>(youthClassoptions);
            youthClassDrop.setBounds(340, 1275, 632, 50);
            youthClassDrop.setFont(new Font("Arial", Font.BOLD, 18));
            youthClassDrop.setBackground(lighterBlue);
            contentPanel.add(youthClassDrop);
            
            String youthClass = (String) youthClassDrop.getSelectedItem();

            JButton continue1 = new JButton("Continue");
            continue1.setBounds(805, 1475, 168, 45);
            continue1.setFont(new Font("Arial", Font.BOLD, 18));
            continue1.setBackground(Blue);
            continue1.setForeground(Color.WHITE);
            continue1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedOption = (String) youthClassDrop.getSelectedItem();

                    switch (selectedOption) {
                        case "[ISY] In-School Youth":
                            schoolInfo(frame);
                            break;
                        case "[WISY] Working-In-School Youth":
                            schoolworkInfo(frame);
                            break;                        
                        case "[OSY] Out-of-School Youth":
                        case "[NEET] Not in Education, Employment, or Training":
                        case "[IP] Indigenous Peoples":
                            addressinfo(frame);
                            break;
                        case "[WY] Working Youth":
                            workingInfo(frame);
                            break;
                        case "[PWD] Persons With Disability":
                            pwdInfo(frame);
                            break;
                        default:
                            break;
                    }
                }
            });
            contentPanel.add(continue1);

            JLabel genderLabel = new JLabel("Gender");
            genderLabel.setBounds(340, 1325, 632, 50);
            genderLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(genderLabel);

            String[] genderoptions = {"Choose", "Male", "Female"};
            JComboBox<String> genderDrop = new JComboBox<>(genderoptions);
            genderDrop.setBounds(340, 1375, 632, 50);
            genderDrop.setFont(new Font("Arial", Font.BOLD, 18));
            genderDrop.setBackground(lighterBlue);
            contentPanel.add(genderDrop);
            
            String gend = (String) genderDrop.getSelectedItem();

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.revalidate();
            frame.repaint();    
        }

        public static void schoolInfo(JFrame frame){
            frame.getContentPane().removeAll();        
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(null);
            contentPanel.setBackground(Color.WHITE);
            contentPanel.setPreferredSize(new Dimension(1350, 1000));

             JPanel imagePanel2 = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            imagePanel2.setBounds(30, 10, 180, 90);
            imagePanel2.setOpaque(false);
            contentPanel.add(imagePanel2);

            JLabel home = new JLabel("Home");
            home.setBounds(280, 10, 180, 90);
            home.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(home, frame, "home");
            contentPanel.add(home);

            JLabel manag = new JLabel("Profile Management");
            manag.setBounds(400, 10, 300, 90);
            manag.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(manag, frame, "profileManagement");
            contentPanel.add(manag);

            JLabel visual = new JLabel("Data Visualization");
            visual.setBounds(680, 10, 300, 90);
            visual.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(visual, frame, "dataVisualization");
            contentPanel.add(visual);

            JLabel admin = new JLabel("Administration");
            admin.setBounds(950, 10, 300, 90);
            admin.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(admin, frame, "admin");
            contentPanel.add(admin);

            JPanel header = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (14).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            header.setBounds(0, 104, 1335, 238);
            header.setOpaque(false);
            contentPanel.add(header);       

            JPanel pageNum = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (19).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            pageNum.setBounds(340, 370, 632, 58);
            pageNum.setOpaque(false);
            contentPanel.add(pageNum);

            JLabel personalInformation = new JLabel("SCHOOL INFORMATION");
            personalInformation.setBounds(340, 330, 700, 300);
            personalInformation.setFont(new Font("Arial", Font.BOLD, 44));
            contentPanel.add(personalInformation);

            JLabel studNumLabel = new JLabel("Student Number");
            studNumLabel.setBounds(340, 525, 250, 50);
            studNumLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(studNumLabel);

            JTextField studNum = new JTextField("Type Here");
            studNum.setBounds(340, 575, 632, 50);
            studNum.setFont(new Font("Arial", Font.BOLD, 18));
            studNum.setForeground(lighterGray);
            studNum.setBackground(lighterBlue);
            studNum.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (studNum.getText().equals("Type Here")) {
                        studNum.setText("");
                        studNum.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (studNum.getText().isEmpty()) {
                        studNum.setForeground(lighterGray);
                        studNum.setText("Type Here");
                    }
                }
                
                String studentNum = studNum.getText();
            });

            contentPanel.add(studNum);

            JLabel schoolNameLabel = new JLabel("School Name");
            schoolNameLabel.setBounds(340, 625, 250, 50);
            schoolNameLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(schoolNameLabel);

            JTextField school = new JTextField("Type Here");
            school.setBounds(340, 675, 632, 50);
            school.setFont(new Font("Arial", Font.BOLD, 18));
            school.setForeground(lighterGray);
            school.setBackground(lighterBlue);
            school.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (school.getText().equals("Type Here")) {
                        school.setText("");
                        school.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (school.getText().isEmpty()) {
                        school.setForeground(lighterGray);
                        school.setText("Type Here");
                    }
                }
                
                String schoolAdd = school.getText();
            });

            contentPanel.add(school);

            JLabel strandCourselabel = new JLabel("Strand/Course");
            strandCourselabel.setBounds(340, 725, 250, 50);
            strandCourselabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(strandCourselabel);

            JTextField strandCourse = new JTextField("Type Here");
            strandCourse.setBounds(340, 775, 632, 50);
            strandCourse.setFont(new Font("Arial", Font.BOLD, 18));
            strandCourse.setForeground(lighterGray);
            strandCourse.setBackground(lighterBlue);
            strandCourse.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (strandCourse.getText().equals("Type Here")) {
                        strandCourse.setText("");
                        strandCourse.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (strandCourse.getText().isEmpty()) {
                        strandCourse.setForeground(lighterGray);
                        strandCourse.setText("Type Here");
                    }
                }
                
                String strndCrs = strandCourse.getText();
            });

            contentPanel.add(strandCourse);

            JButton continue1 = new JButton("Continue");
            continue1.setBounds(805, 875, 168, 45);
            continue1.setFont(new Font("Arial", Font.BOLD, 18));
            continue1.setBackground(Blue);
            continue1.setForeground(Color.WHITE);
            continue1.addActionListener(e ->{
                addressinfo(frame);
            });
            contentPanel.add(continue1);

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.revalidate();
            frame.repaint();    
        }

        public static void pwdInfo(JFrame frame){
            frame.getContentPane().removeAll();        
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(null);
            contentPanel.setBackground(Color.WHITE);
            contentPanel.setPreferredSize(new Dimension(1350, 1000));

             JPanel imagePanel2 = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            imagePanel2.setBounds(30, 10, 180, 90);
            imagePanel2.setOpaque(false);
            contentPanel.add(imagePanel2);

            JLabel home = new JLabel("Home");
            home.setBounds(280, 10, 180, 90);
            home.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(home, frame, "home");
            contentPanel.add(home);

            JLabel manag = new JLabel("Profile Management");
            manag.setBounds(400, 10, 300, 90);
            manag.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(manag, frame, "profileManagement");
            contentPanel.add(manag);

            JLabel visual = new JLabel("Data Visualization");
            visual.setBounds(680, 10, 300, 90);
            visual.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(visual, frame, "dataVisualization");
            contentPanel.add(visual);

            JLabel admin = new JLabel("Administration");
            admin.setBounds(950, 10, 300, 90);
            admin.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(admin, frame, "admin");
            contentPanel.add(admin);

            JPanel header = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (14).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            header.setBounds(0, 104, 1335, 238);
            header.setOpaque(false);
            contentPanel.add(header);       

            JPanel pageNum = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (19).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            pageNum.setBounds(340, 370, 632, 58);
            pageNum.setOpaque(false);
            contentPanel.add(pageNum);

            JLabel personalInformation = new JLabel("PWD INFORMATION");
            personalInformation.setBounds(375, 330, 700, 300);
            personalInformation.setFont(new Font("Arial", Font.BOLD, 44));
            contentPanel.add(personalInformation);

            JLabel pwdIdLabel = new JLabel("PWD ID");
            pwdIdLabel.setBounds(340, 525, 250, 50);
            pwdIdLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(pwdIdLabel);

            JTextField pwdId = new JTextField("Type Here");
            pwdId.setBounds(340, 575, 632, 50);
            pwdId.setFont(new Font("Arial", Font.BOLD, 18));
            pwdId.setForeground(lighterGray);
            pwdId.setBackground(lighterBlue);
            pwdId.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (pwdId.getText().equals("Type Here")) {
                        pwdId.setText("");
                        pwdId.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (pwdId.getText().isEmpty()) {
                        pwdId.setForeground(lighterGray);
                        pwdId.setText("Type Here");
                    }
                }
                
                String pwdID = pwdId.getText();
            });

            contentPanel.add(pwdId);

            JLabel typeLabel = new JLabel("Type of Disability");
            typeLabel.setBounds(340, 625, 250, 50);
            typeLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(typeLabel);

            JTextField type = new JTextField("Type Here");
            type.setBounds(340, 675, 632, 50);
            type.setFont(new Font("Arial", Font.BOLD, 18));
            type.setForeground(lighterGray);
            type.setBackground(lighterBlue);
            type.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (type.getText().equals("Type Here")) {
                        type.setText("");
                        type.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (type.getText().isEmpty()) {
                        type.setForeground(lighterGray);
                        type.setText("Type Here");
                    }
                }
                
                String disType = type.getText();
            });

            contentPanel.add(type);

            JLabel placelabel = new JLabel("Place of Registration");
            placelabel.setBounds(340, 725, 250, 50);
            placelabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(placelabel);

            JTextField place = new JTextField("Type Here");
            place.setBounds(340, 775, 632, 50);
            place.setFont(new Font("Arial", Font.BOLD, 18));
            place.setForeground(lighterGray);
            place.setBackground(lighterBlue);
            place.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (place.getText().equals("Type Here")) {
                        place.setText("");
                        place.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (place.getText().isEmpty()) {
                        place.setForeground(lighterGray);
                        place.setText("Type Here");
                    }
                }
                String placeReg = place.getText();
            });

            contentPanel.add(place);


            JButton continue1 = new JButton("Continue");
            continue1.setBounds(805, 875, 168, 45);
            continue1.setFont(new Font("Arial", Font.BOLD, 18));
            continue1.setBackground(Blue);
            continue1.setForeground(Color.WHITE);
            continue1.addActionListener(e->{
                addressinfo(frame);
                });
            contentPanel.add(continue1);

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.revalidate();
            frame.repaint();    
        }

        public static void workingInfo(JFrame frame){
            frame.getContentPane().removeAll();        
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(null);
            contentPanel.setBackground(Color.WHITE);
            contentPanel.setPreferredSize(new Dimension(1350, 1000));

             JPanel imagePanel2 = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            imagePanel2.setBounds(30, 10, 180, 90);
            imagePanel2.setOpaque(false);
            contentPanel.add(imagePanel2);

            JLabel home = new JLabel("Home");
            home.setBounds(280, 10, 180, 90);
            home.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(home, frame, "home");
            contentPanel.add(home);

            JLabel manag = new JLabel("Profile Management");
            manag.setBounds(400, 10, 300, 90);
            manag.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(manag, frame, "profileManagement");
            contentPanel.add(manag);

            JLabel visual = new JLabel("Data Visualization");
            visual.setBounds(680, 10, 300, 90);
            visual.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(visual, frame, "dataVisualization");
            contentPanel.add(visual);

            JLabel admin = new JLabel("Administration");
            admin.setBounds(950, 10, 300, 90);
            admin.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(admin, frame, "admin");
            contentPanel.add(admin);

            JPanel header = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (14).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            header.setBounds(0, 104, 1335, 238);
            header.setOpaque(false);
            contentPanel.add(header);       

            JPanel pageNum = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (19).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            pageNum.setBounds(340, 370, 632, 58);
            pageNum.setOpaque(false);
            contentPanel.add(pageNum);

            JLabel personalInformation = new JLabel("WORKING INFORMATION");
            personalInformation.setBounds(340, 330, 700, 300);
            personalInformation.setFont(new Font("Arial", Font.BOLD, 44));
            contentPanel.add(personalInformation);

            JLabel workIdLabel = new JLabel("Work ID");
            workIdLabel.setBounds(340, 525, 250, 50);
            workIdLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(workIdLabel);

            JTextField workId = new JTextField("Type Here");
            workId.setBounds(340, 575, 632, 50);
            workId.setFont(new Font("Arial", Font.BOLD, 18));
            workId.setForeground(lighterGray);
            workId.setBackground(lighterBlue);
            workId.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (workId.getText().equals("Type Here")) {
                        workId.setText("");
                        workId.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (workId.getText().isEmpty()) {
                        workId.setForeground(lighterGray);
                        workId.setText("Type Here");
                    }
                }
                
                String workID = workId.getText();
            });

            contentPanel.add(workId);

            JLabel jobLabel = new JLabel("Job Name");
            jobLabel.setBounds(340, 625, 250, 50);
            jobLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(jobLabel);

            JTextField job = new JTextField("Type Here");
            job.setBounds(340, 675, 632, 50);
            job.setFont(new Font("Arial", Font.BOLD, 18));
            job.setForeground(lighterGray);
            job.setBackground(lighterBlue);
            job.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (job.getText().equals("Type Here")) {
                        job.setText("");
                        job.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (job.getText().isEmpty()) {
                        job.setForeground(lighterGray);
                        job.setText("Type Here");
                    }
                }
                
                String jobName = job.getText();
            });

            contentPanel.add(job);

            JLabel companylabel = new JLabel("Company Name");
            companylabel.setBounds(340, 725, 250, 50);
            companylabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(companylabel);

            JTextField company = new JTextField("Type Here");
            company.setBounds(340, 775, 632, 50);
            company.setFont(new Font("Arial", Font.BOLD, 18));
            company.setForeground(lighterGray);
            company.setBackground(lighterBlue);
            company.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (company.getText().equals("Type Here")) {
                        company.setText("");
                        company.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (company.getText().isEmpty()) {
                        company.setForeground(lighterGray);
                        company.setText("Type Here");
                    }
                }
                
                String companyName = company.getText();
            });

            contentPanel.add(company);

            JLabel positionlabel = new JLabel("Work Position");
            positionlabel.setBounds(340, 825, 250, 50);
            positionlabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(positionlabel);

            JTextField position = new JTextField("Type Here");
            position.setBounds(340, 875, 632, 50);
            position.setFont(new Font("Arial", Font.BOLD, 18));
            position.setForeground(lighterGray);
            position.setBackground(lighterBlue);
            position.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (position.getText().equals("Type Here")) {
                        position.setText("");
                        position.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (position.getText().isEmpty()) {
                        position.setForeground(lighterGray);
                        position.setText("Type Here");
                    }
                }
                
                String workPosition = position.getText();
            });

            contentPanel.add(position);

            JButton continue1 = new JButton("Continue");
            continue1.setBounds(805, 875, 168, 45);
            continue1.setFont(new Font("Arial", Font.BOLD, 18));
            continue1.setBackground(Blue);
            continue1.setForeground(Color.WHITE);
            continue1.addActionListener(e->{
                addressinfo(frame);
                });
            contentPanel.add(continue1);

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.revalidate();
            frame.repaint();    
        }

        public static void schoolworkInfo(JFrame frame){
            frame.getContentPane().removeAll();        
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(null);
            contentPanel.setBackground(Color.WHITE);
            contentPanel.setPreferredSize(new Dimension(1350, 1550));

             JPanel imagePanel2 = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            imagePanel2.setBounds(30, 10, 180, 90);
            imagePanel2.setOpaque(false);
            contentPanel.add(imagePanel2);

            JLabel home = new JLabel("Home");
            home.setBounds(280, 10, 180, 90);
            home.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(home, frame, "home");
            contentPanel.add(home);

            JLabel manag = new JLabel("Profile Management");
            manag.setBounds(400, 10, 300, 90);
            manag.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(manag, frame, "profileManagement");
            contentPanel.add(manag);

            JLabel visual = new JLabel("Data Visualization");
            visual.setBounds(680, 10, 300, 90);
            visual.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(visual, frame, "dataVisualization");
            contentPanel.add(visual);

            JLabel admin = new JLabel("Administration");
            admin.setBounds(950, 10, 300, 90);
            admin.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(admin, frame, "admin");
            contentPanel.add(admin);

            JPanel header = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (14).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            header.setBounds(0, 104, 1335, 238);
            header.setOpaque(false);
            contentPanel.add(header);       

            JPanel pageNum = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (19).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            pageNum.setBounds(340, 370, 632, 58);
            pageNum.setOpaque(false);
            contentPanel.add(pageNum);

            JLabel personalInformation = new JLabel("WORK-SCHOOL INFORMATION");
            personalInformation.setBounds(325, 330, 700, 300);
            personalInformation.setFont(new Font("Arial", Font.BOLD, 44));
            contentPanel.add(personalInformation);

            JLabel SchoolLabel = new JLabel("School Information");
            SchoolLabel.setBounds(340, 525, 250, 50);
            SchoolLabel.setFont(new Font("Arial", Font.BOLD, 18));
            SchoolLabel.setForeground(Blue); 
            contentPanel.add(SchoolLabel);

            JLabel studNumLabel = new JLabel("Student Number");
            studNumLabel.setBounds(340, 575, 250, 50);
            studNumLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(studNumLabel);

            JTextField studNum = new JTextField("Type Here");
            studNum.setBounds(340, 625, 632, 50);
            studNum.setFont(new Font("Arial", Font.BOLD, 18));
            studNum.setForeground(lighterGray);
            studNum.setBackground(lighterBlue);
            studNum.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (studNum.getText().equals("Type Here")) {
                        studNum.setText("");
                        studNum.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (studNum.getText().isEmpty()) {
                        studNum.setForeground(lighterGray);
                        studNum.setText("Type Here");
                    }
                }
                
                String studNumber = studNum.getText();
            });

            contentPanel.add(studNum);

            JLabel schoolNameLabel = new JLabel("School Name");
            schoolNameLabel.setBounds(340, 675, 250, 50);
            schoolNameLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(schoolNameLabel);

            JTextField school = new JTextField("Type Here");
            school.setBounds(340, 725, 632, 50);
            school.setFont(new Font("Arial", Font.BOLD, 18));
            school.setForeground(lighterGray);
            school.setBackground(lighterBlue);
            school.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (school.getText().equals("Type Here")) {
                        school.setText("");
                        school.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (school.getText().isEmpty()) {
                        school.setForeground(lighterGray);
                        school.setText("Type Here");
                    }
                }
                
                String schoolName = school.getText();
            });

            contentPanel.add(school);

            JLabel strandCourselabel = new JLabel("Strand/Course");
            strandCourselabel.setBounds(340, 775, 250, 50);
            strandCourselabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(strandCourselabel);

            JTextField strandCourse = new JTextField("Type Here");
            strandCourse.setBounds(340, 825, 632, 50);
            strandCourse.setFont(new Font("Arial", Font.BOLD, 18));
            strandCourse.setForeground(lighterGray);
            strandCourse.setBackground(lighterBlue);
            strandCourse.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (strandCourse.getText().equals("Type Here")) {
                        strandCourse.setText("");
                        strandCourse.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (strandCourse.getText().isEmpty()) {
                        strandCourse.setForeground(lighterGray);
                        strandCourse.setText("Type Here");
                    }
                }
                
                String wsStrandCourse = strandCourse.getText();
            });

            contentPanel.add(strandCourse);

            JLabel workLabel = new JLabel("Work Information");
            workLabel.setBounds(340, 900, 250, 50);
            workLabel.setFont(new Font("Arial", Font.BOLD, 18));
            workLabel.setForeground(Blue); 
            contentPanel.add(workLabel);

            JLabel workIdLabel = new JLabel("Work ID");
            workIdLabel.setBounds(340, 950, 250, 50);
            workIdLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(workIdLabel);

            JTextField workId = new JTextField("Type Here");
            workId.setBounds(340, 1000, 632, 50);
            workId.setFont(new Font("Arial", Font.BOLD, 18));
            workId.setForeground(lighterGray);
            workId.setBackground(lighterBlue);
            workId.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (workId.getText().equals("Type Here")) {
                        workId.setText("");
                        workId.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (workId.getText().isEmpty()) {
                        workId.setForeground(lighterGray);
                        workId.setText("Type Here");
                    }
                }
                
                String wsWorkID = workId.getText();
            });

            contentPanel.add(workId);

            JLabel jobLabel = new JLabel("Job Name");
            jobLabel.setBounds(340, 1050, 250, 50);
            jobLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(jobLabel);

            JTextField job = new JTextField("Type Here");
            job.setBounds(340, 1100, 632, 50);
            job.setFont(new Font("Arial", Font.BOLD, 18));
            job.setForeground(lighterGray);
            job.setBackground(lighterBlue);
            job.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (job.getText().equals("Type Here")) {
                        job.setText("");
                        job.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (job.getText().isEmpty()) {
                        job.setForeground(lighterGray);
                        job.setText("Type Here");
                    }
                }
                
                String wsJob = job.getText();
            });

            contentPanel.add(job);

            JLabel companylabel = new JLabel("Company Name");
            companylabel.setBounds(340, 1150, 250, 50);
            companylabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(companylabel);

            JTextField company = new JTextField("Type Here");
            company.setBounds(340, 1200, 632, 50);
            company.setFont(new Font("Arial", Font.BOLD, 18));
            company.setForeground(lighterGray);
            company.setBackground(lighterBlue);
            company.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (company.getText().equals("Type Here")) {
                        company.setText("");
                        company.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (company.getText().isEmpty()) {
                        company.setForeground(lighterGray);
                        company.setText("Type Here");
                    }
                }
                
                String wsCompany = company.getText();
            });

            contentPanel.add(company);

            JLabel positionlabel = new JLabel("Work Position");
            positionlabel.setBounds(340, 1250, 250, 50);
            positionlabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(positionlabel);

            JTextField position = new JTextField("Type Here");
            position.setBounds(340, 1300, 632, 50);
            position.setFont(new Font("Arial", Font.BOLD, 18));
            position.setForeground(lighterGray);
            position.setBackground(lighterBlue);
            position.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (position.getText().equals("Type Here")) {
                        position.setText("");
                        position.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (position.getText().isEmpty()) {
                        position.setForeground(lighterGray);
                        position.setText("Type Here");
                    }
                }
                
                String wsWorkPos = position.getText();
            });

            contentPanel.add(position);

            JButton continue1 = new JButton("Continue");
            continue1.setBounds(805, 1400, 168, 45);
            continue1.setFont(new Font("Arial", Font.BOLD, 18));
            continue1.setBackground(Blue);
            continue1.setForeground(Color.WHITE);
            continue1.addActionListener(e->{
                addressinfo(frame);
                });
            contentPanel.add(continue1);

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.revalidate();
            frame.repaint();    
        }

        public static void addressinfo(JFrame frame){
            frame.getContentPane().removeAll();        
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(null);
            contentPanel.setBackground(Color.WHITE);
            contentPanel.setPreferredSize(new Dimension(1350, 1800));

             JPanel imagePanel2 = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            imagePanel2.setBounds(30, 10, 180, 90);
            imagePanel2.setOpaque(false);
            contentPanel.add(imagePanel2);

            JLabel home = new JLabel("Home");
            home.setBounds(280, 10, 180, 90);
            home.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(home, frame, "home");
            contentPanel.add(home);

            JLabel manag = new JLabel("Profile Management");
            manag.setBounds(400, 10, 300, 90);
            manag.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(manag, frame, "profileManagement");
            contentPanel.add(manag);

            JLabel visual = new JLabel("Data Visualization");
            visual.setBounds(680, 10, 300, 90);
            visual.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(visual, frame, "dataVisualization");
            contentPanel.add(visual);

            JLabel admin = new JLabel("Administration");
            admin.setBounds(950, 10, 300, 90);
            admin.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(admin, frame, "admin");
            contentPanel.add(admin);

            JPanel header = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (14).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            header.setBounds(0, 104, 1335, 238);
            header.setOpaque(false);
            contentPanel.add(header);       

            JPanel pageNum = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (20).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            pageNum.setBounds(340, 370, 632, 58);
            pageNum.setOpaque(false);
            contentPanel.add(pageNum);

            JLabel personalInformation = new JLabel("ADDRESS");
            personalInformation.setBounds(340, 330, 700, 300);
            personalInformation.setFont(new Font("Arial", Font.BOLD, 44));
            contentPanel.add(personalInformation);

            JLabel birthLabel = new JLabel("Place of Birth");
            birthLabel.setBounds(340, 500, 250, 50);
            birthLabel.setFont(new Font("Arial", Font.BOLD, 18));
            birthLabel.setForeground(Blue); 
            contentPanel.add(birthLabel);

            JLabel StreetLabel = new JLabel("Street");
            StreetLabel.setBounds(340, 550, 250, 50);
            StreetLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(StreetLabel);

            JTextField street = new JTextField("Type Here");
            street.setBounds(340, 600, 632, 50);
            street.setFont(new Font("Arial", Font.BOLD, 18));
            street.setForeground(lighterGray);
            street.setBackground(lighterBlue);
            street.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (street.getText().equals("Type Here")) {
                        street.setText("");
                        street.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (street.getText().isEmpty()) {
                        street.setForeground(lighterGray);
                        street.setText("Type Here");
                    }
                }
                
                String strt = street.getText();
            });

            contentPanel.add(street);

            JLabel BarangayLabel = new JLabel("Barangay");
            BarangayLabel.setBounds(340, 650, 250, 50);
            BarangayLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(BarangayLabel);

            JTextField Barangay = new JTextField("Type Here");
            Barangay.setBounds(340, 700, 632, 50);
            Barangay.setFont(new Font("Arial", Font.BOLD, 18));
            Barangay.setForeground(lighterGray);
            Barangay.setBackground(lighterBlue);
            Barangay.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (Barangay.getText().equals("Type Here")) {
                        Barangay.setText("");
                        Barangay.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (Barangay.getText().isEmpty()) {
                        Barangay.setForeground(lighterGray);
                        Barangay.setText("Type Here");
                    }
                }
                
                String brgy = Barangay.getText();
            });

            contentPanel.add(Barangay);

            JLabel municipalitylabel = new JLabel("Municipality/City");
            municipalitylabel.setBounds(340, 750, 250, 50);
            municipalitylabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(municipalitylabel);

            JTextField municipality = new JTextField("Type Here");
            municipality.setBounds(340, 800, 632, 50);
            municipality.setFont(new Font("Arial", Font.BOLD, 18));
            municipality.setForeground(lighterGray);
            municipality.setBackground(lighterBlue);
            municipality.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (municipality.getText().equals("Type Here")) {
                        municipality.setText("");
                        municipality.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (municipality.getText().isEmpty()) {
                        municipality.setForeground(lighterGray);
                        municipality.setText("Type Here");
                    }
                }
                
                String muncity = municipality.getText();
            });
            contentPanel.add(municipality);

            JLabel provincelabel = new JLabel("Province/City");
            provincelabel.setBounds(340, 850, 250, 50);
            provincelabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(provincelabel);

            JTextField Province = new JTextField("Type Here");
            Province.setBounds(340, 900, 632, 50);
            Province.setFont(new Font("Arial", Font.BOLD, 18));
            Province.setForeground(lighterGray);
            Province.setBackground(lighterBlue);
            Province.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (Province.getText().equals("Type Here")) {
                        Province.setText("");
                        Province.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (Province.getText().isEmpty()) {
                        Province.setForeground(lighterGray);
                        Province.setText("Type Here");
                    }
                }
                
                String prov = Province.getText();
            });
            contentPanel.add(Province);

            JLabel postallabel = new JLabel("Postal Code");
            postallabel.setBounds(340, 950, 250, 50);
            postallabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(postallabel);

            JTextField Postal = new JTextField("Type Here");
            Postal.setBounds(340, 1000, 632, 50);
            Postal.setFont(new Font("Arial", Font.BOLD, 18));
            Postal.setForeground(lighterGray);
            Postal.setBackground(lighterBlue);
            Postal.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (Postal.getText().equals("Type Here")) {
                        Postal.setText("");
                        Postal.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (Postal.getText().isEmpty()) {
                        Postal.setForeground(lighterGray);
                        Postal.setText("Type Here");
                    }
                }
                
                String pcode = Postal.getText();
            });
            contentPanel.add(Postal);

            JLabel currentLabel = new JLabel("Current Address");
            currentLabel.setBounds(340, 1125, 250, 50);
            currentLabel.setFont(new Font("Arial", Font.BOLD, 18));
            currentLabel.setForeground(Blue); 
            contentPanel.add(currentLabel);

            JLabel currentStreetLabel = new JLabel("Street");
            currentStreetLabel.setBounds(340, 1175, 250, 50);
            currentStreetLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(currentStreetLabel);

            JTextField currentStreet = new JTextField("Type Here");
            currentStreet.setBounds(340, 1225, 632, 50);
            currentStreet.setFont(new Font("Arial", Font.BOLD, 18));
            currentStreet.setForeground(lighterGray);
            currentStreet.setBackground(lighterBlue);
            currentStreet.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (currentStreet.getText().equals("Type Here")) {
                        currentStreet.setText("");
                        currentStreet.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (currentStreet.getText().isEmpty()) {
                        currentStreet.setForeground(lighterGray);
                        currentStreet.setText("Type Here");
                    }
                }
            });

            contentPanel.add(currentStreet);

            JLabel currentBarangayLabel = new JLabel("Barangay");
            currentBarangayLabel.setBounds(340, 1275, 250, 50);
            currentBarangayLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(currentBarangayLabel);

            JTextField currentBarangay = new JTextField("Type Here");
            currentBarangay.setBounds(340, 1325, 632, 50);
            currentBarangay.setFont(new Font("Arial", Font.BOLD, 18));
            currentBarangay.setForeground(lighterGray);
            currentBarangay.setBackground(lighterBlue);
            currentBarangay.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (currentBarangay.getText().equals("Type Here")) {
                        currentBarangay.setText("");
                        currentBarangay.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (currentBarangay.getText().isEmpty()) {
                        currentBarangay.setForeground(lighterGray);
                        currentBarangay.setText("Type Here");
                    }
                }
            });

            contentPanel.add(currentBarangay);

            JLabel currentMunicipalitylabel = new JLabel("Municipality/City");
            currentMunicipalitylabel.setBounds(340, 1375, 250, 50);
            currentMunicipalitylabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(currentMunicipalitylabel);

            JTextField currentMunicipality = new JTextField("Type Here");
            currentMunicipality.setBounds(340, 1425, 632, 50);
            currentMunicipality.setFont(new Font("Arial", Font.BOLD, 18));
            currentMunicipality.setForeground(lighterGray);
            currentMunicipality.setBackground(lighterBlue);
            currentMunicipality.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (currentMunicipality.getText().equals("Type Here")) {
                        currentMunicipality.setText("");
                        currentMunicipality.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (currentMunicipality.getText().isEmpty()) {
                        currentMunicipality.setForeground(lighterGray);
                        currentMunicipality.setText("Type Here");
                    }
                }
            });
            contentPanel.add(currentMunicipality);

            JLabel currentProvincelabel = new JLabel("Province/City");
            currentProvincelabel.setBounds(340, 1475, 250, 50);
            currentProvincelabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(currentProvincelabel);

            JTextField currentProvince = new JTextField("Type Here");
            currentProvince.setBounds(340, 1525, 632, 50);
            currentProvince.setFont(new Font("Arial", Font.BOLD, 18));
            currentProvince.setForeground(lighterGray);
            currentProvince.setBackground(lighterBlue);
            currentProvince.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (currentProvince.getText().equals("Type Here")) {
                        currentProvince.setText("");
                        currentProvince.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (currentProvince.getText().isEmpty()) {
                        currentProvince.setForeground(lighterGray);
                        currentProvince.setText("Type Here");
                    }
                }
            });
            contentPanel.add(currentProvince);

            JLabel currentPostallabel = new JLabel("Postal Code");
            currentPostallabel.setBounds(340, 1575, 250, 50);
            currentPostallabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(currentPostallabel);

            JTextField currentPostal = new JTextField("Type Here");
            currentPostal.setBounds(340, 1625, 632, 50);
            currentPostal.setFont(new Font("Arial", Font.BOLD, 18));
            currentPostal.setForeground(lighterGray);
            currentPostal.setBackground(lighterBlue);
            currentPostal.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (currentPostal.getText().equals("Type Here")) {
                        currentPostal.setText("");
                        currentPostal.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (currentPostal.getText().isEmpty()) {
                        currentPostal.setForeground(lighterGray);
                        currentPostal.setText("Type Here");
                    }
                }
            });
            contentPanel.add(currentPostal);

            JCheckBox copyAddressCheckbox = new JCheckBox("Same as Place of Birth");
            copyAddressCheckbox.setBounds(340, 1075, 632, 50);
            copyAddressCheckbox.setFont(new Font("Arial", Font.BOLD, 18));
            copyAddressCheckbox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (copyAddressCheckbox.isSelected()) {
                        currentStreet.setText(street.getText());
                        currentBarangay.setText(Barangay.getText());
                        currentMunicipality.setText(municipality.getText());
                        currentProvince.setText(Province.getText());
                        currentPostal.setText(Postal.getText());
                    }
                }
            });
            contentPanel.add(copyAddressCheckbox);

            JButton back = new JButton("Back");
            back.setBounds(340, 1725, 168, 45);
            back.setFont(new Font("Arial", Font.BOLD, 18));
            back.setBackground(Blue);
            back.setForeground(Color.WHITE);
            back.addActionListener(e -> {
                personalInfo(frame);
            });
            contentPanel.add(back);

            JButton continue1 = new JButton("Continue");
            continue1.setBounds(805, 1725, 168, 45);
            continue1.setFont(new Font("Arial", Font.BOLD, 18));
            continue1.setBackground(Blue);
            continue1.setForeground(Color.WHITE);
            continue1.addActionListener(e -> {
                contactInfo(frame);
            });
            contentPanel.add(continue1);

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.revalidate();
            frame.repaint();    
        }

        public static void contactInfo(JFrame frame){
            frame.getContentPane().removeAll();        
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(null);
            contentPanel.setBackground(Color.WHITE);
            contentPanel.setPreferredSize(new Dimension(1350, 1000));

             JPanel imagePanel2 = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            imagePanel2.setBounds(30, 10, 180, 90);
            imagePanel2.setOpaque(false);
            contentPanel.add(imagePanel2);

            JLabel home = new JLabel("Home");
            home.setBounds(280, 10, 180, 90);
            home.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(home, frame, "home");
            contentPanel.add(home);

            JLabel manag = new JLabel("Profile Management");
            manag.setBounds(400, 10, 300, 90);
            manag.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(manag, frame, "profileManagement");
            contentPanel.add(manag);

            JLabel visual = new JLabel("Data Visualization");
            visual.setBounds(680, 10, 300, 90);
            visual.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(visual, frame, "dataVisualization");
            contentPanel.add(visual);

            JLabel admin = new JLabel("Administration");
            admin.setBounds(950, 10, 300, 90);
            admin.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(admin, frame, "admin");
            contentPanel.add(admin);

            JPanel header = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (14).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            header.setBounds(0, 104, 1335, 238);
            header.setOpaque(false);
            contentPanel.add(header);       

            JPanel pageNum = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (21).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            pageNum.setBounds(340, 370, 632, 58);
            pageNum.setOpaque(false);
            contentPanel.add(pageNum);

            JLabel personalInformation = new JLabel("CONTACTS");
            personalInformation.setBounds(375, 330, 700, 300);
            personalInformation.setFont(new Font("Arial", Font.BOLD, 44));
            contentPanel.add(personalInformation);

            JLabel cellLabel = new JLabel("Cellphone Number");
            cellLabel.setBounds(340, 525, 250, 50);
            cellLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(cellLabel);

            JTextField cellphone = new JTextField("Type Here");
            cellphone.setBounds(340, 575, 632, 50);
            cellphone.setFont(new Font("Arial", Font.BOLD, 18));
            cellphone.setForeground(lighterGray);
            cellphone.setBackground(lighterBlue);
            cellphone.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (cellphone.getText().equals("Type Here")) {
                        cellphone.setText("");
                        cellphone.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (cellphone.getText().isEmpty()) {
                        cellphone.setForeground(lighterGray);
                        cellphone.setText("Type Here");
                    }
                }
            });

            contentPanel.add(cellphone);

            JLabel emailLabel = new JLabel("Email Address");
            emailLabel.setBounds(340, 625, 250, 50);
            emailLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(emailLabel);

            JTextField email = new JTextField("Type Here");
            email.setBounds(340, 675, 632, 50);
            email.setFont(new Font("Arial", Font.BOLD, 18));
            email.setForeground(lighterGray);
            email.setBackground(lighterBlue);
            email.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (email.getText().equals("Type Here")) {
                        email.setText("");
                        email.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (email.getText().isEmpty()) {
                        email.setForeground(lighterGray);
                        email.setText("Type Here");
                    }
                }
            });

            contentPanel.add(email);

            JLabel linkedInlabel = new JLabel("LinkedIn");
            linkedInlabel.setBounds(340, 725, 250, 50);
            linkedInlabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(linkedInlabel);

            JTextField linkedin = new JTextField("Type Here");
            linkedin.setBounds(340, 775, 632, 50);
            linkedin.setFont(new Font("Arial", Font.BOLD, 18));
            linkedin.setForeground(lighterGray);
            linkedin.setBackground(lighterBlue);
            linkedin.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (linkedin.getText().equals("Type Here")) {
                        linkedin.setText("");
                        linkedin.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (linkedin.getText().isEmpty()) {
                        linkedin.setForeground(lighterGray);
                        linkedin.setText("Type Here");
                    }
                }
            });

            contentPanel.add(linkedin);

            JButton continue1 = new JButton("Continue");
            continue1.setBounds(805, 875, 168, 45);
            continue1.setFont(new Font("Arial", Font.BOLD, 18));
            continue1.setBackground(Blue);
            continue1.setForeground(Color.WHITE);
            continue1.addActionListener(e->{
                votersInfo(frame);
                });
            contentPanel.add(continue1);

            JButton back = new JButton("Back");
            back.setBounds(340, 875, 168, 45);
            back.setFont(new Font("Arial", Font.BOLD, 18));
            back.setBackground(Blue);
            back.setForeground(Color.WHITE);
            back.addActionListener(e->{
                addressinfo(frame);
                });
            contentPanel.add(back);

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.revalidate();
            frame.repaint();    
        }

        public static void votersInfo(JFrame frame){
            frame.getContentPane().removeAll();        
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(null);
            contentPanel.setBackground(Color.WHITE);
            contentPanel.setPreferredSize(new Dimension(1350, 1000));

             JPanel imagePanel2 = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            imagePanel2.setBounds(30, 10, 180, 90);
            imagePanel2.setOpaque(false);
            contentPanel.add(imagePanel2);

            JLabel home = new JLabel("Home");
            home.setBounds(280, 10, 180, 90);
            home.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(home, frame, "home");
            contentPanel.add(home);

            JLabel manag = new JLabel("Profile Management");
            manag.setBounds(400, 10, 300, 90);
            manag.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(manag, frame, "profileManagement");
            contentPanel.add(manag);

            JLabel visual = new JLabel("Data Visualization");
            visual.setBounds(680, 10, 300, 90);
            visual.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(visual, frame, "dataVisualization");
            contentPanel.add(visual);

            JLabel admin = new JLabel("Administration");
            admin.setBounds(950, 10, 300, 90);
            admin.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(admin, frame, "admin");
            contentPanel.add(admin);

            JPanel header = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (14).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            header.setBounds(0, 104, 1335, 238);
            header.setOpaque(false);
            contentPanel.add(header);       

            JPanel pageNum = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (24).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            pageNum.setBounds(340, 370, 632, 58);
            pageNum.setOpaque(false);
            contentPanel.add(pageNum);

            JLabel personalInformation = new JLabel("VOTER'S INFORMATION");
            personalInformation.setBounds(340, 330, 700, 300);
            personalInformation.setFont(new Font("Arial", Font.BOLD, 44));
            contentPanel.add(personalInformation);

            JLabel vitLabel = new JLabel("Voter’s ID");
            vitLabel.setBounds(340, 525, 250, 50);
            vitLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(vitLabel);

            JTextField vit = new JTextField("Type Here");
            vit.setBounds(340, 575, 632, 50);
            vit.setFont(new Font("Arial", Font.BOLD, 18));
            vit.setForeground(lighterGray);
            vit.setBackground(lighterBlue);
            vit.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (vit.getText().equals("Type Here")) {
                        vit.setText("");
                        vit.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (vit.getText().isEmpty()) {
                        vit.setForeground(lighterGray);
                        vit.setText("Type Here");
                    }
                }
            });

            contentPanel.add(vit);

            JLabel typeLabel = new JLabel("Voter’s Type");
            typeLabel.setBounds(340, 625, 250, 50);
            typeLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(typeLabel);

            JTextField type = new JTextField("Type Here");
            type.setBounds(340, 675, 632, 50);
            type.setFont(new Font("Arial", Font.BOLD, 18));
            type.setForeground(lighterGray);
            type.setBackground(lighterBlue);
            type.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (type.getText().equals("Type Here")) {
                        type.setText("");
                        type.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (type.getText().isEmpty()) {
                        type.setForeground(lighterGray);
                        type.setText("Type Here");
                    }
                }
            });

            contentPanel.add(type);

            JLabel Precintlabel = new JLabel("Precint No.");
            Precintlabel.setBounds(340, 725, 250, 50);
            Precintlabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(Precintlabel);

            JTextField precint = new JTextField("Type Here");
            precint.setBounds(340, 775, 632, 50);
            precint.setFont(new Font("Arial", Font.BOLD, 18));
            precint.setForeground(lighterGray);
            precint.setBackground(lighterBlue);
            precint.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (precint.getText().equals("Type Here")) {
                        precint.setText("");
                        precint.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (precint.getText().isEmpty()) {
                        precint.setForeground(lighterGray);
                        precint.setText("Type Here");
                    }
                }
            });

            contentPanel.add(precint);

            JButton continue1 = new JButton("Continue");
            continue1.setBounds(805, 875, 168, 45);
            continue1.setFont(new Font("Arial", Font.BOLD, 18));
            continue1.setBackground(Blue);
            continue1.setForeground(Color.WHITE);
            continue1.addActionListener(e->{
    //            parentsInfo(frame);

                });
            contentPanel.add(continue1);

            JButton back = new JButton("Back");
            back.setBounds(340, 875, 168, 45);
            back.setFont(new Font("Arial", Font.BOLD, 18));
            back.setBackground(Blue);
            back.setForeground(Color.WHITE);
            back.addActionListener(e->{
                contactInfo(frame);
                });
            contentPanel.add(back);

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.revalidate();
            frame.repaint();    
        }

        public static void parentsInfo(JFrame frame){
            frame.getContentPane().removeAll();        
            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(null);
            contentPanel.setBackground(Color.WHITE);
            contentPanel.setPreferredSize(new Dimension(1350, 1800));

             JPanel imagePanel2 = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            imagePanel2.setBounds(30, 10, 180, 90);
            imagePanel2.setOpaque(false);
            contentPanel.add(imagePanel2);

            JLabel home = new JLabel("Home");
            home.setBounds(280, 10, 180, 90);
            home.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(home, frame, "home");
            contentPanel.add(home);

            JLabel manag = new JLabel("Profile Management");
            manag.setBounds(400, 10, 300, 90);
            manag.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(manag, frame, "profileManagement");
            contentPanel.add(manag);

            JLabel visual = new JLabel("Data Visualization");
            visual.setBounds(680, 10, 300, 90);
            visual.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(visual, frame, "dataVisualization");
            contentPanel.add(visual);

            JLabel admin = new JLabel("Administration");
            admin.setBounds(950, 10, 300, 90);
            admin.setFont(new Font("Arial", Font.BOLD, 25));
            addHyperlinkAction(admin, frame, "admin");
            contentPanel.add(admin);

            JPanel header = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (14).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            header.setBounds(0, 104, 1335, 238);
            header.setOpaque(false);
            contentPanel.add(header);       

            JPanel pageNum = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (23).png");
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            pageNum.setBounds(340, 370, 632, 58);
            pageNum.setOpaque(false);
            contentPanel.add(pageNum);

            JLabel personalInformation = new JLabel("PARENT'S INFORMATION");
            personalInformation.setBounds(340, 330, 700, 300);
            personalInformation.setFont(new Font("Arial", Font.BOLD, 44));
            contentPanel.add(personalInformation);

            JLabel fatherLabel = new JLabel("Father");
            fatherLabel.setBounds(340, 500, 250, 50);
            fatherLabel.setFont(new Font("Arial", Font.BOLD, 18));
            fatherLabel.setForeground(Blue);     
            contentPanel.add(fatherLabel);

            JLabel lnameLabel = new JLabel("Last Name");
            lnameLabel.setBounds(340, 550, 250, 50);
            lnameLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(lnameLabel);

            JTextField lname = new JTextField("Type Here");
            lname.setBounds(340, 600, 632, 50);
            lname.setFont(new Font("Arial", Font.BOLD, 18));
            lname.setForeground(lighterGray);
            lname.setBackground(lighterBlue);
            lname.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (lname.getText().equals("Type Here")) {
                        lname.setText("");
                        lname.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (lname.getText().isEmpty()) {
                        lname.setForeground(lighterGray);
                        lname.setText("Type Here");
                    }
                }
            });

            contentPanel.add(lname);

            JLabel fnameLabel = new JLabel("First Name");
            fnameLabel.setBounds(340, 650, 250, 50);
            fnameLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(fnameLabel);

            JTextField fname = new JTextField("Type Here");
            fname.setBounds(340, 700, 632, 50);
            fname.setFont(new Font("Arial", Font.BOLD, 18));
            fname.setForeground(lighterGray);
            fname.setBackground(lighterBlue);
            fname.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (fname.getText().equals("Type Here")) {
                        fname.setText("");
                        fname.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (fname.getText().isEmpty()) {
                        fname.setForeground(lighterGray);
                        fname.setText("Type Here");
                    }
                }
            });

            contentPanel.add(fname);

            JLabel mnameLabel = new JLabel("Middle Name");
            mnameLabel.setBounds(340, 750, 250, 50);
            mnameLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(mnameLabel);

            JTextField mname = new JTextField("Type Here");
            mname.setBounds(340, 800, 632, 50);
            mname.setFont(new Font("Arial", Font.BOLD, 18));
            mname.setForeground(lighterGray);
            mname.setBackground(lighterBlue);
            mname.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (mname.getText().equals("Type Here")) {
                        mname.setText("");
                        mname.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (mname.getText().isEmpty()) {
                        mname.setForeground(lighterGray);
                        mname.setText("Type Here");
                    }
                }
            });
            contentPanel.add(mname);

            JLabel enameLabel = new JLabel("Extension Name");
            enameLabel.setBounds(340, 850, 250, 50);
            enameLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(enameLabel);

            JTextField ename = new JTextField("Type Here");
            ename.setBounds(340, 900, 632, 50);
            ename.setFont(new Font("Arial", Font.BOLD, 18));
            ename.setForeground(lighterGray);
            ename.setBackground(lighterBlue);
            ename.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (ename.getText().equals("Type Here")) {
                        ename.setText("");
                        ename.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (ename.getText().isEmpty()) {
                        ename.setForeground(lighterGray);
                        ename.setText("Type Here");
                    }
                }
            });
            contentPanel.add(ename);

            JLabel contactLabel = new JLabel("Contact Number");
            contactLabel.setBounds(340, 950, 250, 50);
            contactLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(contactLabel);

            JTextField contact = new JTextField("Type Here");
            contact.setBounds(340, 1000, 632, 50);
            contact.setFont(new Font("Arial", Font.BOLD, 18));
            contact.setForeground(lighterGray);
            contact.setBackground(lighterBlue);
            contact.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (contact.getText().equals("Type Here")) {
                        contact.setText("");
                        contact.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (contact.getText().isEmpty()) {
                        contact.setForeground(lighterGray);
                        contact.setText("Type Here");
                    }
                }
            });
            contentPanel.add(contact);

            JLabel mother = new JLabel("Mother");
            mother.setBounds(340, 1050, 250, 50);
            mother.setFont(new Font("Arial", Font.BOLD, 18));
            mother.setForeground(Blue); 
            contentPanel.add(mother);

            JLabel lnamemLabel = new JLabel("Last Name (Maiden)");
            lnamemLabel.setBounds(340, 1100, 250, 50);
            lnamemLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(lnamemLabel);

            JTextField lnamem = new JTextField("Type Here");
            lnamem.setBounds(340, 1150, 632, 50);
            lnamem.setFont(new Font("Arial", Font.BOLD, 18));
            lnamem.setForeground(lighterGray);
            lnamem.setBackground(lighterBlue);
            lnamem.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (lnamem.getText().equals("Type Here")) {
                        lnamem.setText("");
                        lnamem.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (lnamem.getText().isEmpty()) {
                        lnamem.setForeground(lighterGray);
                        lnamem.setText("Type Here");
                    }
                }
            });

            contentPanel.add(lnamem);

            JLabel fnamemLabel = new JLabel("First Name (Maiden)");
            fnamemLabel.setBounds(340, 1200, 250, 50);
            fnamemLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(fnamemLabel);

            JTextField fnamem = new JTextField("Type Here");
            fnamem.setBounds(340, 1250, 632, 50);
            fnamem.setFont(new Font("Arial", Font.BOLD, 18));
            fnamem.setForeground(lighterGray);
            fnamem.setBackground(lighterBlue);
            fnamem.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (fnamem.getText().equals("Type Here")) {
                        fnamem.setText("");
                        fnamem.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (fnamem.getText().isEmpty()) {
                        fnamem.setForeground(lighterGray);
                        fnamem.setText("Type Here");
                    }
                }
            });

            contentPanel.add(fnamem);

            JLabel mnamemLabel = new JLabel("Middle Name (maiden)");
            mnamemLabel.setBounds(340, 1300, 250, 50);
            mnamemLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(mnamemLabel);

            JTextField mnamem = new JTextField("Type Here");
            mnamem.setBounds(340, 1350, 632, 50);
            mnamem.setFont(new Font("Arial", Font.BOLD, 18));
            mnamem.setForeground(lighterGray);
            mnamem.setBackground(lighterBlue);
            mnamem.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (mnamem.getText().equals("Type Here")) {
                        mnamem.setText("");
                        mnamem.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (mnamem.getText().isEmpty()) {
                        mnamem.setForeground(lighterGray);
                        mnamem.setText("Type Here");
                    }
                }
            });
            contentPanel.add(mnamem);

            JLabel cnumLabel = new JLabel("Contact Number");
            cnumLabel.setBounds(340, 1400, 250, 50);
            cnumLabel.setFont(new Font("Arial", Font.BOLD, 18));
            contentPanel.add(cnumLabel);

            JTextField cnum = new JTextField("Type Here");
            cnum.setBounds(340, 1450, 632, 50);
            cnum.setFont(new Font("Arial", Font.BOLD, 18));
            cnum.setForeground(lighterGray);
            cnum.setBackground(lighterBlue);
            cnum.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (cnum.getText().equals("Type Here")) {
                        cnum.setText("");
                        cnum.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (cnum.getText().isEmpty()) {
                        cnum.setForeground(lighterGray);
                        cnum.setText("Type Here");
                    }
                }
            });
            contentPanel.add(cnum);

            JButton back = new JButton("Back");
            back.setBounds(340, 1525, 168, 45);
            back.setFont(new Font("Arial", Font.BOLD, 18));
            back.setBackground(Blue);
            back.setForeground(Color.WHITE);
            back.addActionListener(e -> {
                votersInfo(frame);
            });
            contentPanel.add(back);

            JButton save = new JButton("Save");
            save.setBounds(805, 1525, 168, 45);
            save.setFont(new Font("Arial", Font.BOLD, 18));
            save.setBackground(Blue);
            save.setForeground(Color.WHITE);
            contentPanel.add(save);

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.revalidate();
            frame.repaint();    
        }

    public static void overallInfo(){
        String query = "INSERT INTO ";
    }
    public static void updateKabataan(JFrame frame) {
        frame.getContentPane().removeAll();
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setPreferredSize(new Dimension(1350, 720));

        JPanel imagePanel2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        imagePanel2.setBounds(30, 10, 180, 90);
        imagePanel2.setOpaque(false);
        contentPanel.add(imagePanel2);

        JLabel home = new JLabel("Home");
        home.setBounds(280, 10, 180, 90);
        home.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(home, frame, "home");
        contentPanel.add(home);

        JLabel manag = new JLabel("Profile Management");
        manag.setBounds(400, 10, 300, 90);
        manag.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(manag, frame, "profileManagement");
        contentPanel.add(manag);

        JLabel visual = new JLabel("Data Visualization");
        visual.setBounds(680, 10, 300, 90);
        visual.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(visual, frame, "dataVisualization");
        contentPanel.add(visual);

        JLabel admin = new JLabel("Administration");
        admin.setBounds(950, 10, 300, 90);
        admin.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(admin, frame, "admin");
        contentPanel.add(admin);
        
        JTextField searchID = new JTextField("Enter SK ID you want to Search");
        searchID.setBounds(100, 342, 519, 50);
        searchID.setFont(new Font("Arial", Font.BOLD, 18));
        searchID.setForeground(lighterGray);
        searchID.setBackground(lighterBlue);
        searchID.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchID.getText().equals("Type Here")) {
                    searchID.setText("");
                    searchID.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (searchID.getText().isEmpty()) {
                    searchID.setForeground(lighterGray);
                    searchID.setText("Type Here");
                }
            }
        });
        contentPanel.add(searchID);
        
        JButton Search = new JButton("Search");
        Search.setBounds(640, 342, 200, 50);
        Search.setFont(new Font("Arial", Font.BOLD, 18));
        Search.setBackground(Blue);
        Search.setForeground(Color.WHITE);
        contentPanel.add(Search);
        
        JButton Save = new JButton("Save");
        Save.setBounds(1025, 342, 200, 50);
        Save.setFont(new Font("Arial", Font.BOLD, 18));
        Save.setBackground(Blue);
        Save.setForeground(Color.WHITE);
        contentPanel.add(Save);
        
        JLabel lnamelabel = new JLabel("Lastname");
        lnamelabel.setBounds(100, 430, 250, 50);
        lnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(lnamelabel);
        
        JTextField lname = new JTextField();
        lname.setBounds(100, 480, 250, 50);
        lname.setFont(new Font("Arial", Font.BOLD, 18));
        lname.setForeground(Color.LIGHT_GRAY);
        lname.setBackground(lighterBlue);
        contentPanel.add(lname);
        
        JLabel fnamelabel = new JLabel("Firstname");
        fnamelabel.setBounds(375, 430, 300, 50);
        fnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(fnamelabel);
        
        JTextField fname = new JTextField();
        fname.setBounds(375, 480, 350, 50);
        fname.setFont(new Font("Arial", Font.BOLD, 18));
        fname.setForeground(Color.LIGHT_GRAY);
        fname.setBackground(lighterBlue);
        contentPanel.add(fname);
        
        JLabel mnamelabel = new JLabel("Middlename");
        mnamelabel.setBounds(750, 430, 250, 50);
        mnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(mnamelabel);
        
        JTextField mname = new JTextField();
        mname.setBounds(750, 480, 250, 50);
        mname.setFont(new Font("Arial", Font.BOLD, 18));
        mname.setForeground(Color.LIGHT_GRAY);
        mname.setBackground(lighterBlue);
        contentPanel.add(mname);
        
        JLabel enamelabel = new JLabel("Extension Name");
        enamelabel.setBounds(1025, 430, 250, 50);
        enamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(enamelabel);
        
        JTextField ename = new JTextField();
        ename.setBounds(1025, 480, 200, 50);
        ename.setFont(new Font("Arial", Font.BOLD, 18));
        ename.setBackground(lighterBlue);
        ename.setForeground(Color.LIGHT_GRAY);
        contentPanel.add(ename);
        
        JPanel header = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (15).png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        header.setBounds(0, 104, 1335, 238);
        header.setOpaque(false);
        contentPanel.add(header);
        
        JLabel newLabel = new JLabel("New Information");
        newLabel.setBounds(725, 550, 400, 50);
        newLabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(newLabel);
        
        JTextField newInfo = new JTextField("Type Here");
        newInfo.setBounds(725, 600, 500, 50);
        newInfo.setFont(new Font("Arial", Font.BOLD, 18));
        newInfo.setForeground(lighterGray);
        newInfo.setBackground(lighterBlue);
        newInfo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (newInfo.getText().equals("Type Here")) {
                    newInfo.setText("");
                    newInfo.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (newInfo.getText().isEmpty()) {
                    newInfo.setForeground(lighterGray);
                    newInfo.setText("Type Here");
                }
            }
        });
        contentPanel.add(newInfo);
        
        JLabel toUpdate = new JLabel("Information you want to Update");
        toUpdate.setBounds(100, 550, 600, 50);
        toUpdate.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(toUpdate);
        
        String[] genderoptions = {"Choose", "Last Name", "First Name", "Middle Name", "Date of Birth (mm/dd/yyyy)" , "Gender", "Civil Status", "Citizenship", "Youth Classification",
                "Place of Birth - Street", "Place of Birth - Barangay", "Place of Birth - Municipality/City", "Place of Birth - Province/City", "Place of Birth - Postal Code", 
                "Current Address - Street", "Current Address - Barangay", "Current Address - Municipality/City", "Current Address - Province/City", "Current Address - Postal Code", 
                "PWD ID", "Type of Disability", "Place of Registration", "Student Number", "School Name", "Strand/Course", "Work ID", "Job Name",
                "Company Name", "Work Position", "Cellphone Number", "Email Address", "LinkedIn", "Voter’s ID", "Voter’s Type", "Precint Number",
                "Father's Last Name", "Father's First Name", "Father's Middle Name", "Father's Extension Name", "Father's Contact Number", 
                "Mother's Last Name", "Mother's First Name", "Mother's Middle Name", "Mother's Contact Number", };
        JComboBox<String> genderDrop = new JComboBox<>(genderoptions);
        genderDrop.setBounds(100, 600, 600, 50);
        genderDrop.setFont(new Font("Arial", Font.BOLD, 18));
        genderDrop.setBackground(lighterBlue);
        contentPanel.add(genderDrop);
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.revalidate();
        frame.repaint();    
    }
    
    public static void searchKabataan(JFrame frame) {
        frame.getContentPane().removeAll();        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setPreferredSize(new Dimension(1350, 720));

        JPanel imagePanel2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        imagePanel2.setBounds(30, 10, 180, 90);
        imagePanel2.setOpaque(false);
        contentPanel.add(imagePanel2);

        JLabel home = new JLabel("Home");
        home.setBounds(280, 10, 180, 90);
        home.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(home, frame, "home");
        contentPanel.add(home);

        JLabel manag = new JLabel("Profile Management");
        manag.setBounds(400, 10, 300, 90);
        manag.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(manag, frame, "profileManagement");
        contentPanel.add(manag);

        JLabel visual = new JLabel("Data Visualization");
        visual.setBounds(680, 10, 300, 90);
        visual.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(visual, frame, "dataVisualization");
        contentPanel.add(visual);

        JLabel admin = new JLabel("Administration");
        admin.setBounds(950, 10, 300, 90);
        admin.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(admin, frame, "admin");
        contentPanel.add(admin);
        
        JTextField searchID = new JTextField("Enter SK ID you want to Search");
        searchID.setBounds(100, 400, 519, 50);
        searchID.setFont(new Font("Arial", Font.BOLD, 18));
        searchID.setForeground(lighterGray);
        searchID.setBackground(lighterBlue);
        searchID.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchID.getText().equals("Type Here")) {
                    searchID.setText("");
                    searchID.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (searchID.getText().isEmpty()) {
                    searchID.setForeground(lighterGray);
                    searchID.setText("Type Here");
                }
            }
        });
        contentPanel.add(searchID);
        
        JButton Search = new JButton("Search");
        Search.setBounds(640, 400, 200, 50);
        Search.setFont(new Font("Arial", Font.BOLD, 18));
        Search.setBackground(Blue);
        Search.setForeground(Color.WHITE);
        contentPanel.add(Search);
        
        JButton See = new JButton("See More");
        See.setBounds(1025, 400, 200, 50);
        See.setFont(new Font("Arial", Font.BOLD, 18));
        See.setBackground(Blue);
        See.setForeground(Color.WHITE);
        contentPanel.add(See);
        
        JLabel lnamelabel = new JLabel("Lastname");
        lnamelabel.setBounds(100, 500, 250, 50);
        lnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(lnamelabel);
        
        JTextField lname = new JTextField();
        lname.setBounds(100, 550, 250, 50);
        lname.setFont(new Font("Arial", Font.BOLD, 18));
        lname.setForeground(Color.LIGHT_GRAY);
        lname.setBackground(lighterBlue);
        contentPanel.add(lname);
        
        JLabel fnamelabel = new JLabel("Firstname");
        fnamelabel.setBounds(375, 500, 300, 50);
        fnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(fnamelabel);
        
        JTextField fname = new JTextField();
        fname.setBounds(375, 550, 350, 50);
        fname.setFont(new Font("Arial", Font.BOLD, 18));
        fname.setForeground(Color.LIGHT_GRAY);
        fname.setBackground(lighterBlue);
        contentPanel.add(fname);
        
        JLabel mnamelabel = new JLabel("Middlename");
        mnamelabel.setBounds(750, 500, 250, 50);
        mnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(mnamelabel);
        
        JTextField mname = new JTextField();
        mname.setBounds(750, 550, 250, 50);
        mname.setFont(new Font("Arial", Font.BOLD, 18));
        mname.setForeground(Color.LIGHT_GRAY);
        mname.setBackground(lighterBlue);
        contentPanel.add(mname);
        
        JLabel enamelabel = new JLabel("Extension Name");
        enamelabel.setBounds(1025, 500, 250, 50);
        enamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(enamelabel);
        
        JTextField ename = new JTextField();
        ename.setBounds(1025, 550, 200, 50);
        ename.setFont(new Font("Arial", Font.BOLD, 18));
        ename.setBackground(lighterBlue);
        ename.setForeground(Color.LIGHT_GRAY);
        contentPanel.add(ename);
        
        JPanel header = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (16).png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        header.setBounds(0, 104, 1335, 238);
        header.setOpaque(false);
        contentPanel.add(header);       
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.revalidate();
        frame.repaint();    
    }
    
    public static void retrieveKabataan(JFrame frame) {
        frame.getContentPane().removeAll();        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setPreferredSize(new Dimension(1350, 720));

        JPanel imagePanel2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        imagePanel2.setBounds(30, 10, 180, 90);
        imagePanel2.setOpaque(false);
        contentPanel.add(imagePanel2);

        JLabel home = new JLabel("Home");
        home.setBounds(280, 10, 180, 90);
        home.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(home, frame, "home");
        contentPanel.add(home);

        JLabel manag = new JLabel("Profile Management");
        manag.setBounds(400, 10, 300, 90);
        manag.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(manag, frame, "profileManagement");
        contentPanel.add(manag);

        JLabel visual = new JLabel("Data Visualization");
        visual.setBounds(680, 10, 300, 90);
        visual.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(visual, frame, "dataVisualization");
        contentPanel.add(visual);

        JLabel admin = new JLabel("Administration");
        admin.setBounds(950, 10, 300, 90);
        admin.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(admin, frame, "admin");
        contentPanel.add(admin);
        
        JTextField searchID = new JTextField("Enter SK ID you want to Search");
        searchID.setBounds(100, 400, 519, 50);
        searchID.setFont(new Font("Arial", Font.BOLD, 18));
        searchID.setForeground(lighterGray);
        searchID.setBackground(lighterBlue);
        searchID.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchID.getText().equals("Type Here")) {
                    searchID.setText("");
                    searchID.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (searchID.getText().isEmpty()) {
                    searchID.setForeground(lighterGray);
                    searchID.setText("Type Here");
                }
            }
        });
        contentPanel.add(searchID);
        
        JButton Search = new JButton("Search");
        Search.setBounds(640, 400, 200, 50);
        Search.setFont(new Font("Arial", Font.BOLD, 18));
        Search.setBackground(Blue);
        Search.setForeground(Color.WHITE);
        contentPanel.add(Search);
        
        JButton Retieve = new JButton("Retrieve");
        Retieve.setBounds(1025, 400, 200, 50);
        Retieve.setFont(new Font("Arial", Font.BOLD, 18));
        Retieve.setBackground(Blue);
        Retieve.setForeground(Color.WHITE);
        contentPanel.add(Retieve);
        
        JLabel lnamelabel = new JLabel("Lastname");
        lnamelabel.setBounds(100, 500, 250, 50);
        lnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(lnamelabel);
        
        JTextField lname = new JTextField();
        lname.setBounds(100, 550, 250, 50);
        lname.setFont(new Font("Arial", Font.BOLD, 18));
        lname.setForeground(Color.LIGHT_GRAY);
        lname.setBackground(lighterBlue);
        contentPanel.add(lname);
        
        JLabel fnamelabel = new JLabel("Firstname");
        fnamelabel.setBounds(375, 500, 300, 50);
        fnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(fnamelabel);
        
        JTextField fname = new JTextField();
        fname.setBounds(375, 550, 350, 50);
        fname.setFont(new Font("Arial", Font.BOLD, 18));
        fname.setForeground(Color.LIGHT_GRAY);
        fname.setBackground(lighterBlue);
        contentPanel.add(fname);
        
        JLabel mnamelabel = new JLabel("Middlename");
        mnamelabel.setBounds(750, 500, 250, 50);
        mnamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(mnamelabel);
        
        JTextField mname = new JTextField();
        mname.setBounds(750, 550, 250, 50);
        mname.setFont(new Font("Arial", Font.BOLD, 18));
        mname.setForeground(Color.LIGHT_GRAY);
        mname.setBackground(lighterBlue);
        contentPanel.add(mname);
        
        JLabel enamelabel = new JLabel("Extension Name");
        enamelabel.setBounds(1025, 500, 250, 50);
        enamelabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(enamelabel);
        
        JTextField ename = new JTextField();
        ename.setBounds(1025, 550, 200, 50);
        ename.setFont(new Font("Arial", Font.BOLD, 18));
        ename.setBackground(lighterBlue);
        ename.setForeground(Color.LIGHT_GRAY);
        contentPanel.add(ename);
        
        JPanel header = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (17).png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        header.setBounds(0, 104, 1335, 238);
        header.setOpaque(false);
        contentPanel.add(header);       
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.revalidate();
        frame.repaint();    
    }

    public static void dataVisualization(JFrame frame) {
        frame.getContentPane().removeAll();        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setPreferredSize(new Dimension(1350, 1650));

        JPanel imagePanel2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        imagePanel2.setBounds(30, 10, 180, 90);
        imagePanel2.setOpaque(false);
        contentPanel.add(imagePanel2);

        JLabel home = new JLabel("Home");
        home.setBounds(280, 10, 180, 90);
        home.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(home, frame, "home");
        contentPanel.add(home);

        JLabel manag = new JLabel("Profile Management");
        manag.setBounds(400, 10, 300, 90);
        manag.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(manag, frame, "profileManagement");
        contentPanel.add(manag);

        JLabel visual = new JLabel("Data Visualization");
        visual.setBounds(680, 10, 300, 90);
        visual.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(visual, frame, "dataVisualization");
        contentPanel.add(visual);

        JLabel admin = new JLabel("Administration");
        admin.setBounds(950, 10, 300, 90);
        admin.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(admin, frame, "admin");
        contentPanel.add(admin);
        
        JLabel overall = new JLabel("SUMMARY AND VISUALIZATION");
        overall.setBounds(300, 250, 1000, 200);
        overall.setFont(new Font("Arial", Font.BOLD, 50));
        contentPanel.add(overall);
        
        JPanel header = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (10).png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        header.setBounds(0, 104, 1335, 238);
        header.setOpaque(false);
        contentPanel.add(header);       
        
        JLabel totalkabataan = new JLabel("Total Kabataan :");
        totalkabataan.setBounds(300, 400, 250, 50);
        totalkabataan.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totalkabataan);
        
        JTextField totalK = new JTextField();
        totalK.setBounds(600, 400, 600, 50);
        totalK.setFont(new Font("Arial", Font.BOLD, 18));
        totalK.setForeground(Color.LIGHT_GRAY);
        totalK.setBackground(lighterBlue);
        contentPanel.add(totalK);
        
        JLabel gender = new JLabel("GENDER");
        gender.setBounds(300, 430, 1000, 200);
        gender.setFont(new Font("Arial", Font.BOLD, 50));
        contentPanel.add(gender);
        
        JLabel totFemale = new JLabel("Total Female Kabataan :");
        totFemale.setBounds(300, 580, 250, 50);
        totFemale.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totFemale);
        
        JTextField female = new JTextField();
        female.setBounds(600, 580, 600, 50);
        female.setFont(new Font("Arial", Font.BOLD, 18));
        female.setForeground(Color.LIGHT_GRAY);
        female.setBackground(lighterBlue);
        contentPanel.add(female);
        
        JLabel totMale = new JLabel("Total Male Kabataan :");
        totMale.setBounds(300, 640, 250, 50);
        totMale.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totMale);
        
        JTextField male = new JTextField();
        male.setBounds(600, 640, 600, 50);
        male.setFont(new Font("Arial", Font.BOLD, 18));
        male.setForeground(Color.LIGHT_GRAY);
        male.setBackground(lighterBlue);
        contentPanel.add(male);
        
        JLabel civstatus = new JLabel("CIVIL STATUS");
        civstatus.setBounds(300, 670, 1000, 200);
        civstatus.setFont(new Font("Arial", Font.BOLD, 50));
        contentPanel.add(civstatus);
        
        JLabel totSingle = new JLabel("Total Single Kabataan :");
        totSingle.setBounds(300, 820, 250, 50);
        totSingle.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totSingle);
        
        JTextField single = new JTextField();
        single.setBounds(600, 820, 600, 50);
        single.setFont(new Font("Arial", Font.BOLD, 18));
        single.setForeground(Color.LIGHT_GRAY);
        single.setBackground(lighterBlue);
        contentPanel.add(single);
        
        JLabel totMarried = new JLabel("Total Married Kabataan :");
        totMarried.setBounds(300, 880, 250, 50);
        totMarried.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totMarried);
        
        JTextField married = new JTextField();
        married.setBounds(600, 880, 600, 50);
        married.setFont(new Font("Arial", Font.BOLD, 18));
        married.setForeground(Color.LIGHT_GRAY);
        married.setBackground(lighterBlue);
        contentPanel.add(married);
        
        JLabel totDivorced = new JLabel("Total Divorced Kabataan :");
        totDivorced.setBounds(300, 940, 250, 50);
        totDivorced.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totDivorced);
        
        JTextField Divorced = new JTextField();
        Divorced.setBounds(600, 940, 600, 50);
        Divorced.setFont(new Font("Arial", Font.BOLD, 18));
        Divorced.setForeground(Color.LIGHT_GRAY);
        Divorced.setBackground(lighterBlue);
        contentPanel.add(Divorced);
        
        JLabel totWidowed = new JLabel("Total Widowed Kabataan :");
        totWidowed.setBounds(300, 1000, 250, 50);
        totWidowed.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totWidowed);
        
        JTextField Widowed = new JTextField();
        Widowed.setBounds(600, 1000, 600, 50);
        Widowed.setFont(new Font("Arial", Font.BOLD, 18));
        Widowed.setForeground(Color.LIGHT_GRAY);
        Widowed.setBackground(lighterBlue);
        contentPanel.add(Widowed);
        
        JLabel yclass = new JLabel("YOUTH CLASSIFICATION");
        yclass.setBounds(300, 1050, 1000, 200);
        yclass.setFont(new Font("Arial", Font.BOLD, 50));
        contentPanel.add(yclass);
        
        JLabel totISY = new JLabel("Total In-School Youth :");
        totISY.setBounds(329, 1210, 250, 50);
        totISY.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totISY);
        
        JTextField ISY = new JTextField();
        ISY.setBounds(600, 1210, 600, 50);
        ISY.setFont(new Font("Arial", Font.BOLD, 18));
        ISY.setForeground(Color.LIGHT_GRAY);
        ISY.setBackground(lighterBlue);
        contentPanel.add(ISY);
        
        JLabel totOSY = new JLabel("Total Out-of-School Youth :");
        totOSY.setBounds(292, 1270, 250, 50);
        totOSY.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totOSY);
        
        JTextField OSY = new JTextField();
        OSY.setBounds(600, 1270, 600, 50);
        OSY.setFont(new Font("Arial", Font.BOLD, 18));
        OSY.setForeground(Color.LIGHT_GRAY);
        OSY.setBackground(lighterBlue);
        contentPanel.add(OSY);
        
        JLabel totNEET = new JLabel("Total Not in Education, Employment, or Training :");
        totNEET.setBounds(100, 1330, 1500, 50);
        totNEET.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totNEET);
        
        JTextField NEET = new JTextField();
        NEET.setBounds(600, 1330, 600, 50);
        NEET.setFont(new Font("Arial", Font.BOLD, 18));
        NEET.setForeground(Color.LIGHT_GRAY);
        NEET.setBackground(lighterBlue);
        contentPanel.add(NEET);
        
        JLabel totWY = new JLabel("Total Working Youth :");
        totWY.setBounds(337, 1390, 250, 50);
        totWY.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totWY);    
        
        JTextField WY = new JTextField();
        WY.setBounds(600, 1390, 600, 50);
        WY.setFont(new Font("Arial", Font.BOLD, 18));
        WY.setForeground(Color.LIGHT_GRAY);
        WY.setBackground(lighterBlue);
        contentPanel.add(WY);
        
        JLabel totWISY = new JLabel("Total Working-In-School Youth :");
        totWISY.setBounds(250, 1450, 1000, 50);
        totWISY.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totWISY);
        
        JTextField WISY = new JTextField();
        WISY.setBounds(600, 1450, 600, 50);
        WISY.setFont(new Font("Arial", Font.BOLD, 18));
        WISY.setForeground(Color.LIGHT_GRAY);
        WISY.setBackground(lighterBlue);
        contentPanel.add(WISY);
        
        JLabel totPWD = new JLabel("Total Persons With Disability :");
        totPWD.setBounds(265, 1510, 1000, 50);
        totPWD.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totPWD);
        
        JTextField PWD = new JTextField();
        PWD.setBounds(600, 1510, 600, 50);
        PWD.setFont(new Font("Arial", Font.BOLD, 18));
        PWD.setForeground(Color.LIGHT_GRAY);
        PWD.setBackground(lighterBlue);
        contentPanel.add(PWD);
        
        JLabel totIP = new JLabel("Total  Indigenous Peoples :");
        totIP.setBounds(288, 1570, 250, 50);
        totIP.setFont(new Font("Arial", Font.BOLD, 18));
        contentPanel.add(totIP);
        
        JTextField IP = new JTextField();
        IP.setBounds(600, 1570, 600, 50);
        IP.setFont(new Font("Arial", Font.BOLD, 18));
        IP.setForeground(Color.LIGHT_GRAY);
        IP.setBackground(lighterBlue);
        contentPanel.add(IP);
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scrollPane, BorderLayout.CENTER);
        
        frame.revalidate();
        frame.repaint();
    }    
   
    public static void admin(JFrame frame) {
        frame.getContentPane().removeAll();
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Blue);
        contentPanel.setPreferredSize(new Dimension(1350, 720));

        JPanel imagePanel2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Desktop\\LOGO SK.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        imagePanel2.setBounds(30, 10, 180, 90);
        imagePanel2.setOpaque(false);
        contentPanel.add(imagePanel2);

        JLabel home = new JLabel("Home");
        home.setBounds(280, 10, 180, 90);
        home.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(home, frame, "home");
        contentPanel.add(home);

        JLabel manag = new JLabel("Profile Management");
        manag.setBounds(400, 10, 300, 90);
        manag.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(manag, frame, "profileManagement");
        contentPanel.add(manag);

        JLabel visual = new JLabel("Data Visualization");
        visual.setBounds(680, 10, 300, 90);
        visual.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(visual, frame, "dataVisualization");
        contentPanel.add(visual);

        JLabel admin = new JLabel("Administration");
        admin.setBounds(950, 10, 300, 90);
        admin.setFont(new Font("Arial", Font.BOLD, 25));
        addHyperlinkAction(admin, frame, "admin");
        contentPanel.add(admin);
        
        JPanel white = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\Downloads\\SK SYSTEM! (13).png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        white.setBounds(0, 0, 1350, 108);
        contentPanel.add(white);
        
        JPanel usIcon = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Pictures\\1.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        usIcon.setBounds(140, 205, 40, 40);
        usIcon.setOpaque(false);
        contentPanel.add(usIcon);

        JPanel erIcon = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Pictures\\2.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        erIcon.setBounds(140,285, 40, 40);
        erIcon.setOpaque(false);
        contentPanel.add(erIcon);
        
        JPanel aIcon = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Pictures\\3.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        aIcon.setBounds(140,365, 40, 40);
        aIcon.setOpaque(false);
        contentPanel.add(aIcon);
        
        JPanel tcIcon = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Pictures\\4.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        tcIcon.setBounds(140,445, 40, 40);
        tcIcon.setOpaque(false);
        contentPanel.add(tcIcon);
        
        JPanel devIcon = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Randy Lorenzo\\OneDrive\\Pictures\\5.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        devIcon.setBounds(140,525, 40, 40);
        devIcon.setOpaque(false);
        contentPanel.add(devIcon);
        
        JButton UserMan = new JButton("       User Management");
        UserMan.setBounds(130, 200, 1060, 50);
        UserMan.setBackground(cyan);
        UserMan.setForeground(Blue);
        UserMan.setFont(new Font("Arial", Font.BOLD, 25));
        UserMan.setHorizontalAlignment(SwingConstants.LEFT);
        contentPanel.add(UserMan);
        
        JButton roles = new JButton("       Edit Roles");
        roles.setBounds(130, 280, 1060, 50);
        roles.setBackground(cyan);
        roles.setForeground(Blue);
        roles.setFont(new Font("Arial", Font.BOLD, 25));
        roles.setHorizontalAlignment(SwingConstants.LEFT);
        contentPanel.add(roles);
        
        JButton archive = new JButton("       Archive Kabataan");
        archive.setBounds(130, 360, 1060, 50);
        archive.setBackground(cyan);
        archive.setForeground(Blue);
        archive.setFont(new Font("Arial", Font.BOLD, 25));
        archive.setHorizontalAlignment(SwingConstants.LEFT);
        contentPanel.add(archive);
        
        JButton TaC = new JButton("       Terms and Condition");
        TaC.setBounds(130, 440, 1060, 50);
        TaC.setBackground(cyan);
        TaC.setForeground(Blue);
        TaC.setFont(new Font("Arial", Font.BOLD, 25));
        TaC.setHorizontalAlignment(SwingConstants.LEFT);
        contentPanel.add(TaC);
        
        JButton developers = new JButton("       About the Developers");
        developers.setBounds(130, 520, 1060, 50);
        developers.setBackground(cyan);
        developers.setForeground(Blue);
        developers.setFont(new Font("Arial", Font.BOLD, 25));
        developers.setHorizontalAlignment(SwingConstants.LEFT);
        contentPanel.add(developers);
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.revalidate();
        frame.repaint();
    }

    private static void addHyperlinkAction(JLabel label, JFrame frame, String methodName) {
        label.setForeground(Color.BLUE.darker());
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                switch (methodName) {
                    case "profileManagement":
                        profileManagement(frame);
                        break;
                    case "dataVisualization":
                        dataVisualization(frame);
                        break;
                    case "admin":
                        admin(frame);
                        break;
                    case "home":
                        home(frame);
                        break;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setForeground(maroon);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setForeground(Color.BLUE.darker());
            }
        });
    }
    
    private static void openWebPage(String url) {
        try {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                desktop.browse(new URI(url));
            } else {
                JOptionPane.showMessageDialog(null, "Desktop browsing is not supported on this platform.");
            }
        } catch (IOException | URISyntaxException e) {
            JOptionPane.showMessageDialog(null, "Error opening web page: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

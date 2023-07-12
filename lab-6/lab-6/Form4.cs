using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab_6
{
    public partial class Form4 : Form
    {
        //static public Form1 f1 = null;
        //static public Form3 f3 = null;
        public Form4()
        {
            InitializeComponent();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Form1 f1 = new Form1();
            if (f1 == null)
                f1 = new Form1();
            f1.Show();
            f1.Activate();
        }

        private void button3_Click_1(object sender, EventArgs e)
        {
            Form3 f3 = new Form3();
            if (f3 == null)
                f3 = new Form3();
            f3.Show();
            f3.Activate();
        }
    }
}

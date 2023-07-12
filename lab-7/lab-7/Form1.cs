using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab_7
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            //1
            //DialogResult result = MessageBox.Show("Чи дійсно потрібно закрити вікно?", "Підтвердження", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            //if (result == DialogResult.No)
            //{
            //    e.Cancel = true;
            //}

            //2

            Form2 f2 = new Form2();
            if (f2 == null)
                f2 = new Form2();
            f2.Show();
            f2.Activate();
            e.Cancel = true;
        }
    }
}

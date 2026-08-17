.class abstract Lcom/bumptech/glide/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method static a(Lcom/bumptech/glide/b;Ljava/util/List;Lcom/bumptech/glide/module/AppGlideModule;)Lcom/bumptech/glide/h;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/b;->g()Ly1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/bumptech/glide/b;->f()Ly1/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/bumptech/glide/b;->j()Lcom/bumptech/glide/d;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0}, Lcom/bumptech/glide/b;->j()Lcom/bumptech/glide/d;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Lcom/bumptech/glide/d;->f()Lcom/bumptech/glide/e;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, Lcom/bumptech/glide/h;

    .line 26
    .line 27
    invoke-direct {v4}, Lcom/bumptech/glide/h;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v4, v0, v1, v3}, Lcom/bumptech/glide/i;->b(Landroid/content/Context;Lcom/bumptech/glide/h;Ly1/d;Ly1/b;Lcom/bumptech/glide/e;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, p0, v4, p1, p2}, Lcom/bumptech/glide/i;->c(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;Ljava/util/List;Lcom/bumptech/glide/module/AppGlideModule;)V

    .line 34
    .line 35
    .line 36
    return-object v4
.end method

.method private static b(Landroid/content/Context;Lcom/bumptech/glide/h;Ly1/d;Ly1/b;Lcom/bumptech/glide/e;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 1
    new-instance v5, Lcom/bumptech/glide/load/resource/bitmap/m;

    invoke-direct {v5}, Lcom/bumptech/glide/load/resource/bitmap/m;-><init>()V

    invoke-virtual {v1, v5}, Lcom/bumptech/glide/h;->r(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/h;

    .line 2
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1b

    if-lt v5, v6, :cond_0

    .line 3
    new-instance v6, Lcom/bumptech/glide/load/resource/bitmap/w;

    invoke-direct {v6}, Lcom/bumptech/glide/load/resource/bitmap/w;-><init>()V

    invoke-virtual {v1, v6}, Lcom/bumptech/glide/h;->r(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/h;

    .line 4
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 5
    invoke-virtual {v1}, Lcom/bumptech/glide/h;->g()Ljava/util/List;

    move-result-object v7

    .line 6
    new-instance v8, LH1/a;

    invoke-direct {v8, v0, v7, v2, v3}, LH1/a;-><init>(Landroid/content/Context;Ljava/util/List;Ly1/d;Ly1/b;)V

    .line 7
    invoke-static {v2}, Lcom/bumptech/glide/load/resource/bitmap/d0;->k(Ly1/d;)Lv1/j;

    move-result-object v9

    .line 8
    new-instance v10, Lcom/bumptech/glide/load/resource/bitmap/t;

    .line 9
    invoke-virtual {v1}, Lcom/bumptech/glide/h;->g()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v12

    invoke-direct {v10, v11, v12, v2, v3}, Lcom/bumptech/glide/load/resource/bitmap/t;-><init>(Ljava/util/List;Landroid/util/DisplayMetrics;Ly1/d;Ly1/b;)V

    const/16 v11, 0x1c

    if-lt v5, v11, :cond_1

    .line 10
    const-class v12, Lcom/bumptech/glide/c$b;

    .line 11
    invoke-virtual {v4, v12}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    move-result v12

    if-eqz v12, :cond_1

    .line 12
    new-instance v12, Lcom/bumptech/glide/load/resource/bitmap/U;

    invoke-direct {v12}, Lcom/bumptech/glide/load/resource/bitmap/U;-><init>()V

    .line 13
    new-instance v13, Lcom/bumptech/glide/load/resource/bitmap/k;

    invoke-direct {v13}, Lcom/bumptech/glide/load/resource/bitmap/k;-><init>()V

    goto :goto_0

    .line 14
    :cond_1
    new-instance v13, Lcom/bumptech/glide/load/resource/bitmap/i;

    invoke-direct {v13, v10}, Lcom/bumptech/glide/load/resource/bitmap/i;-><init>(Lcom/bumptech/glide/load/resource/bitmap/t;)V

    .line 15
    new-instance v12, Lcom/bumptech/glide/load/resource/bitmap/Z;

    invoke-direct {v12, v10, v3}, Lcom/bumptech/glide/load/resource/bitmap/Z;-><init>(Lcom/bumptech/glide/load/resource/bitmap/t;Ly1/b;)V

    .line 16
    :goto_0
    const-string v14, "Animation"

    const-class v15, Ljava/nio/ByteBuffer;

    const-class v4, Landroid/graphics/drawable/Drawable;

    move-object/from16 v16, v8

    const-class v8, Ljava/io/InputStream;

    if-lt v5, v11, :cond_2

    .line 17
    invoke-static {v7, v3}, LF1/h;->f(Ljava/util/List;Ly1/b;)Lv1/j;

    move-result-object v11

    .line 18
    invoke-virtual {v1, v14, v8, v4, v11}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 19
    invoke-static {v7, v3}, LF1/h;->a(Ljava/util/List;Ly1/b;)Lv1/j;

    move-result-object v11

    .line 20
    invoke-virtual {v1, v14, v15, v4, v11}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 21
    :cond_2
    new-instance v11, LF1/l;

    invoke-direct {v11, v0}, LF1/l;-><init>(Landroid/content/Context;)V

    move/from16 v17, v5

    .line 22
    new-instance v5, Lcom/bumptech/glide/load/resource/bitmap/c;

    invoke-direct {v5, v3}, Lcom/bumptech/glide/load/resource/bitmap/c;-><init>(Ly1/b;)V

    .line 23
    new-instance v0, LI1/a;

    invoke-direct {v0}, LI1/a;-><init>()V

    move-object/from16 v18, v0

    .line 24
    new-instance v0, LI1/d;

    invoke-direct {v0}, LI1/d;-><init>()V

    move-object/from16 v19, v0

    .line 25
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object/from16 v20, v0

    .line 26
    new-instance v0, LB1/c;

    invoke-direct {v0}, LB1/c;-><init>()V

    .line 27
    invoke-virtual {v1, v15, v0}, Lcom/bumptech/glide/h;->c(Ljava/lang/Class;Lv1/d;)Lcom/bumptech/glide/h;

    move-result-object v0

    move-object/from16 v21, v4

    new-instance v4, LB1/u;

    invoke-direct {v4, v3}, LB1/u;-><init>(Ly1/b;)V

    .line 28
    invoke-virtual {v0, v8, v4}, Lcom/bumptech/glide/h;->c(Ljava/lang/Class;Lv1/d;)Lcom/bumptech/glide/h;

    move-result-object v0

    .line 29
    const-string v4, "Bitmap"

    move-object/from16 v22, v11

    const-class v11, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v4, v15, v11, v13}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    .line 30
    invoke-virtual {v0, v4, v8, v11, v12}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 31
    invoke-static {}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->b()Z

    move-result v0

    move/from16 v23, v0

    const-class v0, Landroid/os/ParcelFileDescriptor;

    if-eqz v23, :cond_3

    move-object/from16 v23, v14

    .line 32
    new-instance v14, Lcom/bumptech/glide/load/resource/bitmap/W;

    invoke-direct {v14, v10}, Lcom/bumptech/glide/load/resource/bitmap/W;-><init>(Lcom/bumptech/glide/load/resource/bitmap/t;)V

    invoke-virtual {v1, v4, v0, v11, v14}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    goto :goto_1

    :cond_3
    move-object/from16 v23, v14

    .line 33
    :goto_1
    invoke-static {v2}, Lcom/bumptech/glide/load/resource/bitmap/d0;->a(Ly1/d;)Lv1/j;

    move-result-object v10

    .line 34
    const-class v14, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v1, v4, v14, v11, v10}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 35
    invoke-virtual {v1, v4, v0, v11, v9}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v10

    move-object/from16 v24, v14

    .line 36
    invoke-static {}, LB1/w$a;->a()LB1/w$a;

    move-result-object v14

    invoke-virtual {v10, v11, v11, v14}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v10

    new-instance v14, Lcom/bumptech/glide/load/resource/bitmap/b0;

    invoke-direct {v14}, Lcom/bumptech/glide/load/resource/bitmap/b0;-><init>()V

    .line 37
    invoke-virtual {v10, v4, v11, v11, v14}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v10

    .line 38
    invoke-virtual {v10, v11, v5}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Lv1/k;)Lcom/bumptech/glide/h;

    move-result-object v10

    new-instance v14, Lcom/bumptech/glide/load/resource/bitmap/a;

    invoke-direct {v14, v6, v13}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Landroid/content/res/Resources;Lv1/j;)V

    .line 39
    const-string v13, "BitmapDrawable"

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v10, v13, v15, v1, v14}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v10

    new-instance v14, Lcom/bumptech/glide/load/resource/bitmap/a;

    invoke-direct {v14, v6, v12}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Landroid/content/res/Resources;Lv1/j;)V

    .line 40
    invoke-virtual {v10, v13, v8, v1, v14}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v10

    new-instance v12, Lcom/bumptech/glide/load/resource/bitmap/a;

    invoke-direct {v12, v6, v9}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Landroid/content/res/Resources;Lv1/j;)V

    .line 41
    invoke-virtual {v10, v13, v0, v1, v12}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v9

    new-instance v10, Lcom/bumptech/glide/load/resource/bitmap/b;

    invoke-direct {v10, v2, v5}, Lcom/bumptech/glide/load/resource/bitmap/b;-><init>(Ly1/d;Lv1/k;)V

    .line 42
    invoke-virtual {v9, v1, v10}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Lv1/k;)Lcom/bumptech/glide/h;

    move-result-object v5

    new-instance v9, LH1/j;

    move-object/from16 v10, v16

    invoke-direct {v9, v7, v10, v3}, LH1/j;-><init>(Ljava/util/List;Lv1/j;Ly1/b;)V

    .line 43
    const-class v7, LH1/c;

    move-object/from16 v12, v23

    invoke-virtual {v5, v12, v8, v7, v9}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v5

    .line 44
    invoke-virtual {v5, v12, v15, v7, v10}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v5

    new-instance v9, LH1/d;

    invoke-direct {v9}, LH1/d;-><init>()V

    .line 45
    invoke-virtual {v5, v7, v9}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Lv1/k;)Lcom/bumptech/glide/h;

    move-result-object v5

    .line 46
    invoke-static {}, LB1/w$a;->a()LB1/w$a;

    move-result-object v9

    .line 47
    const-class v10, Ls1/a;

    invoke-virtual {v5, v10, v10, v9}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v5

    new-instance v9, LH1/h;

    invoke-direct {v9, v2}, LH1/h;-><init>(Ly1/d;)V

    .line 48
    invoke-virtual {v5, v4, v10, v11, v9}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v4

    .line 49
    const-class v5, Landroid/net/Uri;

    move-object/from16 v10, v21

    move-object/from16 v9, v22

    invoke-virtual {v4, v5, v10, v9}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v4

    new-instance v12, Lcom/bumptech/glide/load/resource/bitmap/Y;

    invoke-direct {v12, v9, v2}, Lcom/bumptech/glide/load/resource/bitmap/Y;-><init>(LF1/l;Ly1/d;)V

    .line 50
    invoke-virtual {v4, v5, v11, v12}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v4

    new-instance v9, LE1/a$a;

    invoke-direct {v9}, LE1/a$a;-><init>()V

    .line 51
    invoke-virtual {v4, v9}, Lcom/bumptech/glide/h;->s(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/h;

    move-result-object v4

    new-instance v9, LB1/d$b;

    invoke-direct {v9}, LB1/d$b;-><init>()V

    .line 52
    const-class v12, Ljava/io/File;

    invoke-virtual {v4, v12, v15, v9}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v4

    new-instance v9, LB1/g$e;

    invoke-direct {v9}, LB1/g$e;-><init>()V

    .line 53
    invoke-virtual {v4, v12, v8, v9}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v4

    new-instance v9, LG1/a;

    invoke-direct {v9}, LG1/a;-><init>()V

    .line 54
    invoke-virtual {v4, v12, v12, v9}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v4

    new-instance v9, LB1/g$b;

    invoke-direct {v9}, LB1/g$b;-><init>()V

    .line 55
    invoke-virtual {v4, v12, v0, v9}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v4

    .line 56
    invoke-static {}, LB1/w$a;->a()LB1/w$a;

    move-result-object v9

    invoke-virtual {v4, v12, v12, v9}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v4

    new-instance v9, Lcom/bumptech/glide/load/data/k$a;

    invoke-direct {v9, v3}, Lcom/bumptech/glide/load/data/k$a;-><init>(Ly1/b;)V

    .line 57
    invoke-virtual {v4, v9}, Lcom/bumptech/glide/h;->s(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/h;

    .line 58
    invoke-static {}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->b()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 59
    new-instance v3, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;

    invoke-direct {v3}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;-><init>()V

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lcom/bumptech/glide/h;->s(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/h;

    goto :goto_2

    :cond_4
    move-object/from16 v4, p1

    .line 60
    :goto_2
    invoke-static/range {p0 .. p0}, LB1/f;->e(Landroid/content/Context;)LB1/o;

    move-result-object v3

    .line 61
    invoke-static/range {p0 .. p0}, LB1/f;->a(Landroid/content/Context;)LB1/o;

    move-result-object v9

    .line 62
    invoke-static/range {p0 .. p0}, LB1/f;->c(Landroid/content/Context;)LB1/o;

    move-result-object v13

    .line 63
    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v16, v7

    invoke-virtual {v4, v14, v8, v3}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v7

    .line 64
    const-class v2, Ljava/lang/Integer;

    invoke-virtual {v7, v2, v8, v3}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v3

    move-object/from16 v7, v24

    .line 65
    invoke-virtual {v3, v14, v7, v9}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v3

    .line 66
    invoke-virtual {v3, v2, v7, v9}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v3

    .line 67
    invoke-virtual {v3, v14, v10, v13}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v3

    .line 68
    invoke-virtual {v3, v2, v10, v13}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v3

    .line 69
    invoke-static/range {p0 .. p0}, LB1/t;->d(Landroid/content/Context;)LB1/o;

    move-result-object v9

    invoke-virtual {v3, v5, v8, v9}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v3

    .line 70
    invoke-static/range {p0 .. p0}, LB1/t;->c(Landroid/content/Context;)LB1/o;

    move-result-object v9

    .line 71
    invoke-virtual {v3, v5, v7, v9}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    .line 72
    new-instance v3, LB1/s$c;

    invoke-direct {v3, v6}, LB1/s$c;-><init>(Landroid/content/res/Resources;)V

    .line 73
    new-instance v9, LB1/s$a;

    invoke-direct {v9, v6}, LB1/s$a;-><init>(Landroid/content/res/Resources;)V

    .line 74
    new-instance v13, LB1/s$b;

    invoke-direct {v13, v6}, LB1/s$b;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 v21, v1

    .line 75
    invoke-virtual {v4, v2, v5, v3}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    .line 76
    invoke-virtual {v1, v14, v5, v3}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    .line 77
    invoke-virtual {v1, v2, v7, v9}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    .line 78
    invoke-virtual {v1, v14, v7, v9}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    .line 79
    invoke-virtual {v1, v2, v8, v13}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    .line 80
    invoke-virtual {v1, v14, v8, v13}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    .line 81
    new-instance v1, LB1/e$c;

    invoke-direct {v1}, LB1/e$c;-><init>()V

    .line 82
    const-class v2, Ljava/lang/String;

    invoke-virtual {v4, v2, v8, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    new-instance v3, LB1/e$c;

    invoke-direct {v3}, LB1/e$c;-><init>()V

    .line 83
    invoke-virtual {v1, v5, v8, v3}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    new-instance v3, LB1/v$c;

    invoke-direct {v3}, LB1/v$c;-><init>()V

    .line 84
    invoke-virtual {v1, v2, v8, v3}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    new-instance v3, LB1/v$b;

    invoke-direct {v3}, LB1/v$b;-><init>()V

    .line 85
    invoke-virtual {v1, v2, v0, v3}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    new-instance v3, LB1/v$a;

    invoke-direct {v3}, LB1/v$a;-><init>()V

    .line 86
    invoke-virtual {v1, v2, v7, v3}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    new-instance v2, LB1/a$c;

    .line 87
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-direct {v2, v3}, LB1/a$c;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v1, v5, v8, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    new-instance v2, LB1/a$b;

    .line 88
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-direct {v2, v3}, LB1/a$b;-><init>(Landroid/content/res/AssetManager;)V

    .line 89
    invoke-virtual {v1, v5, v7, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    new-instance v2, LC1/b$a;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, LC1/b$a;-><init>(Landroid/content/Context;)V

    .line 90
    invoke-virtual {v1, v5, v8, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v1

    new-instance v2, LC1/c$a;

    invoke-direct {v2, v3}, LC1/c$a;-><init>(Landroid/content/Context;)V

    .line 91
    invoke-virtual {v1, v5, v8, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    const/16 v1, 0x1d

    move/from16 v2, v17

    if-lt v2, v1, :cond_5

    .line 92
    new-instance v1, LC1/d$c;

    invoke-direct {v1, v3}, LC1/d$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v5, v8, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    .line 93
    new-instance v1, LC1/d$b;

    invoke-direct {v1, v3}, LC1/d$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v5, v0, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    .line 94
    :cond_5
    const-class v1, Lcom/bumptech/glide/c$e;

    move-object/from16 v2, p4

    .line 95
    invoke-virtual {v2, v1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    move-result v1

    .line 96
    new-instance v2, LB1/x$d;

    move-object/from16 v9, v20

    invoke-direct {v2, v9, v1}, LB1/x$d;-><init>(Landroid/content/ContentResolver;Z)V

    .line 97
    invoke-virtual {v4, v5, v8, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v2

    new-instance v13, LB1/x$b;

    invoke-direct {v13, v9, v1}, LB1/x$b;-><init>(Landroid/content/ContentResolver;Z)V

    .line 98
    invoke-virtual {v2, v5, v0, v13}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v2, LB1/x$a;

    invoke-direct {v2, v9, v1}, LB1/x$a;-><init>(Landroid/content/ContentResolver;Z)V

    .line 99
    invoke-virtual {v0, v5, v7, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, LB1/y$a;

    invoke-direct {v1}, LB1/y$a;-><init>()V

    .line 100
    invoke-virtual {v0, v5, v8, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, LC1/g$a;

    invoke-direct {v1}, LC1/g$a;-><init>()V

    .line 101
    const-class v2, Ljava/net/URL;

    invoke-virtual {v0, v2, v8, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, LB1/l$a;

    invoke-direct {v1, v3}, LB1/l$a;-><init>(Landroid/content/Context;)V

    .line 102
    invoke-virtual {v0, v5, v12, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, LC1/a$a;

    invoke-direct {v1}, LC1/a$a;-><init>()V

    .line 103
    const-class v2, LB1/h;

    invoke-virtual {v0, v2, v8, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, LB1/b$a;

    invoke-direct {v1}, LB1/b$a;-><init>()V

    .line 104
    const-class v2, [B

    invoke-virtual {v0, v2, v15, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, LB1/b$d;

    invoke-direct {v1}, LB1/b$d;-><init>()V

    .line 105
    invoke-virtual {v0, v2, v8, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v0

    .line 106
    invoke-static {}, LB1/w$a;->a()LB1/w$a;

    move-result-object v1

    invoke-virtual {v0, v5, v5, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v0

    .line 107
    invoke-static {}, LB1/w$a;->a()LB1/w$a;

    move-result-object v1

    invoke-virtual {v0, v10, v10, v1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;LB1/o;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, LF1/m;

    invoke-direct {v1}, LF1/m;-><init>()V

    .line 108
    invoke-virtual {v0, v10, v10, v1}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, LI1/b;

    invoke-direct {v1, v6}, LI1/b;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 v3, v21

    .line 109
    invoke-virtual {v0, v11, v3, v1}, Lcom/bumptech/glide/h;->t(Ljava/lang/Class;Ljava/lang/Class;LI1/e;)Lcom/bumptech/glide/h;

    move-result-object v0

    move-object/from16 v1, v18

    .line 110
    invoke-virtual {v0, v11, v2, v1}, Lcom/bumptech/glide/h;->t(Ljava/lang/Class;Ljava/lang/Class;LI1/e;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v5, LI1/c;

    move-object/from16 v7, p2

    move-object/from16 v8, v19

    invoke-direct {v5, v7, v1, v8}, LI1/c;-><init>(Ly1/d;LI1/e;LI1/e;)V

    .line 111
    invoke-virtual {v0, v10, v2, v5}, Lcom/bumptech/glide/h;->t(Ljava/lang/Class;Ljava/lang/Class;LI1/e;)Lcom/bumptech/glide/h;

    move-result-object v0

    move-object/from16 v1, v16

    .line 112
    invoke-virtual {v0, v1, v2, v8}, Lcom/bumptech/glide/h;->t(Ljava/lang/Class;Ljava/lang/Class;LI1/e;)Lcom/bumptech/glide/h;

    .line 113
    invoke-static {v7}, Lcom/bumptech/glide/load/resource/bitmap/d0;->b(Ly1/d;)Lv1/j;

    move-result-object v0

    .line 114
    invoke-virtual {v4, v15, v11, v0}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 115
    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/a;

    invoke-direct {v1, v6, v0}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Landroid/content/res/Resources;Lv1/j;)V

    invoke-virtual {v4, v15, v3, v1}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    return-void
.end method

.method private static c(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;Ljava/util/List;Lcom/bumptech/glide/module/AppGlideModule;)V
    .locals 1

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LK1/a;

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v0, p0, p1, p2}, LK1/a;->b(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception p0

    .line 22
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string p3, "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you\'re using Glide v4. You\'ll need to find and remove (or update) the offending dependency. The v3 module name is: "

    .line 30
    .line 31
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_0
    if-eqz p4, :cond_1

    .line 54
    .line 55
    invoke-virtual {p4, p0, p1, p2}, LK1/b;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method static d(Lcom/bumptech/glide/b;Ljava/util/List;Lcom/bumptech/glide/module/AppGlideModule;)LQ1/f$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/bumptech/glide/i$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/bumptech/glide/i$a;-><init>(Lcom/bumptech/glide/b;Ljava/util/List;Lcom/bumptech/glide/module/AppGlideModule;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

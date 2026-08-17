.class Lx1/k$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final a:Lx1/h$e;

.field final b:LH0/e;

.field private c:I


# direct methods
.method constructor <init>(Lx1/h$e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx1/k$a$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lx1/k$a$a;-><init>(Lx1/k$a;)V

    .line 7
    .line 8
    .line 9
    const/16 v1, 0x96

    .line 10
    .line 11
    invoke-static {v1, v0}, LR1/a;->d(ILR1/a$d;)LH0/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lx1/k$a;->b:LH0/e;

    .line 16
    .line 17
    iput-object p1, p0, Lx1/k$a;->a:Lx1/h$e;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method a(Lcom/bumptech/glide/d;Ljava/lang/Object;Lx1/n;Lv1/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;Lx1/j;Ljava/util/Map;ZZZLv1/h;Lx1/h$b;)Lx1/h;
    .locals 20

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lx1/k$a;->b:LH0/e;

    invoke-interface {v1}, LH0/e;->acquire()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/h;

    invoke-static {v1}, LQ1/k;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lx1/h;

    .line 2
    iget v1, v0, Lx1/k$a;->c:I

    add-int/lit8 v3, v1, 0x1

    iput v3, v0, Lx1/k$a;->c:I

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p12

    move/from16 v15, p13

    move/from16 v16, p14

    move-object/from16 v17, p15

    move-object/from16 v18, p16

    move/from16 v19, v1

    invoke-virtual/range {v2 .. v19}, Lx1/h;->y(Lcom/bumptech/glide/d;Ljava/lang/Object;Lx1/n;Lv1/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;Lx1/j;Ljava/util/Map;ZZZLv1/h;Lx1/h$b;I)Lx1/h;

    move-result-object v1

    return-object v1
.end method

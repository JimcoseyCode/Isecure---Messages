.class public final synthetic LP/E;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ/a;


# instance fields
.field public final synthetic a:LP/L;

.field public final synthetic b:LP/L$a;

.field public final synthetic c:I

.field public final synthetic d:Ly/w0$a;

.field public final synthetic e:Ly/w0$a;


# direct methods
.method public synthetic constructor <init>(LP/L;LP/L$a;ILy/w0$a;Ly/w0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP/E;->a:LP/L;

    .line 5
    .line 6
    iput-object p2, p0, LP/E;->b:LP/L$a;

    .line 7
    .line 8
    iput p3, p0, LP/E;->c:I

    .line 9
    .line 10
    iput-object p4, p0, LP/E;->d:Ly/w0$a;

    .line 11
    .line 12
    iput-object p5, p0, LP/E;->e:Ly/w0$a;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lm5/a;
    .locals 6

    .line 1
    iget-object v0, p0, LP/E;->a:LP/L;

    .line 2
    .line 3
    iget-object v1, p0, LP/E;->b:LP/L$a;

    .line 4
    .line 5
    iget v2, p0, LP/E;->c:I

    .line 6
    .line 7
    iget-object v3, p0, LP/E;->d:Ly/w0$a;

    .line 8
    .line 9
    iget-object v4, p0, LP/E;->e:Ly/w0$a;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    check-cast v5, Landroid/view/Surface;

    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, LP/L;->d(LP/L;LP/L$a;ILy/w0$a;Ly/w0$a;Landroid/view/Surface;)Lm5/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

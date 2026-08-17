.class Lo/a$a;
.super Lz0/a$c;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/a;->b()Lz0/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/a;


# direct methods
.method constructor <init>(Lo/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/a$a;->a:Lo/a;

    .line 2
    .line 3
    invoke-direct {p0}, Lz0/a$c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(ILjava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/a$a;->a:Lo/a;

    .line 2
    .line 3
    iget-object v0, v0, Lo/a;->c:Lo/a$d;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lo/a$d;->a(ILjava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/a$a;->a:Lo/a;

    .line 2
    .line 3
    iget-object v0, v0, Lo/a;->c:Lo/a$d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lo/a$d;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(ILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lo/a$a;->a:Lo/a;

    .line 2
    .line 3
    iget-object p1, p1, Lo/a;->c:Lo/a$d;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lo/a$d;->c(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(Lz0/a$d;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lz0/a$d;->a()Lz0/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lo/i;->c(Lz0/a$e;)Lo/f$c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    new-instance v0, Lo/f$b;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-direct {v0, p1, v1}, Lo/f$b;-><init>(Lo/f$c;I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lo/a$a;->a:Lo/a;

    .line 20
    .line 21
    iget-object p1, p1, Lo/a;->c:Lo/a$d;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lo/a$d;->d(Lo/f$b;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

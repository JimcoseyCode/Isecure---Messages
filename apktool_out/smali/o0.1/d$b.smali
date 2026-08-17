.class Lo0/d$b;
.super Lo0/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic g:Lo0/d;


# direct methods
.method public constructor <init>(Lo0/d;Lo0/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo0/d$b;->g:Lo0/d;

    .line 2
    .line 3
    invoke-direct {p0}, Lo0/b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lo0/j;

    .line 7
    .line 8
    invoke-direct {p1, p0, p2}, Lo0/j;-><init>(Lo0/b;Lo0/c;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lo0/b;->e:Lo0/b$a;

    .line 12
    .line 13
    return-void
.end method

.class public final Ls9/d$g;
.super Li9/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls9/d;->r(Ljava/lang/String;Ls9/d$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:J

.field final synthetic g:Ls9/d;

.field final synthetic h:Ljava/lang/String;

.field final synthetic i:Ls9/d$d;

.field final synthetic j:Ls9/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLs9/d;Ljava/lang/String;Ls9/d$d;Ls9/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls9/d$g;->e:Ljava/lang/String;

    .line 2
    .line 3
    iput-wide p3, p0, Ls9/d$g;->f:J

    .line 4
    .line 5
    iput-object p5, p0, Ls9/d$g;->g:Ls9/d;

    .line 6
    .line 7
    iput-object p6, p0, Ls9/d$g;->h:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p7, p0, Ls9/d$g;->i:Ls9/d$d;

    .line 10
    .line 11
    iput-object p8, p0, Ls9/d$g;->j:Ls9/e;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    const/4 p3, 0x0

    .line 15
    const/4 p4, 0x0

    .line 16
    invoke-direct {p0, p2, p4, p1, p3}, Li9/a;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Ls9/d$g;->g:Ls9/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls9/d;->x()V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Ls9/d$g;->f:J

    .line 7
    .line 8
    return-wide v0
.end method

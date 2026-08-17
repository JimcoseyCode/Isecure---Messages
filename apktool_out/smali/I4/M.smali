.class final LI4/M;
.super LI4/T;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field final synthetic k:LI4/X;


# direct methods
.method constructor <init>(LI4/X;)V
    .locals 1

    .line 1
    iput-object p1, p0, LI4/M;->k:LI4/X;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, LI4/T;-><init>(LI4/X;LI4/S;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method final b(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/M;->k:LI4/X;

    .line 2
    .line 3
    invoke-static {v0, p1}, LI4/X;->j(LI4/X;I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

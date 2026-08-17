.class public final Le9/c$a$a;
.super Lt9/n;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/c$a;-><init>(Lh9/d$d;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:Le9/c$a;

.field final synthetic h:Lt9/F;


# direct methods
.method constructor <init>(Le9/c$a;Lt9/F;Lt9/F;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le9/c$a$a;->g:Le9/c$a;

    .line 2
    .line 3
    iput-object p2, p0, Le9/c$a$a;->h:Lt9/F;

    .line 4
    .line 5
    invoke-direct {p0, p3}, Lt9/n;-><init>(Lt9/F;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Le9/c$a$a;->g:Le9/c$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Le9/c$a;->e()Lh9/d$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lh9/d$d;->close()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Lt9/n;->close()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.class Lo/d$k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/d;->W(Lo/f$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:Lo/f$b;

.field final synthetic h:Lo/d;


# direct methods
.method constructor <init>(Lo/d;Lo/f$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/d$k;->h:Lo/d;

    .line 2
    .line 3
    iput-object p2, p0, Lo/d$k;->g:Lo/f$b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo/d$k;->h:Lo/d;

    .line 2
    .line 3
    iget-object v0, v0, Lo/d;->h:Lo/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lo/g;->l()Lo/f$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lo/d$k;->g:Lo/f$b;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lo/f$a;->onAuthenticationSucceeded(Lo/f$b;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

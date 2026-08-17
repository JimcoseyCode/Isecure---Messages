.class Lo/d$j;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/d;->M(ILjava/lang/CharSequence;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:I

.field final synthetic h:Ljava/lang/CharSequence;

.field final synthetic i:Lo/d;


# direct methods
.method constructor <init>(Lo/d;ILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/d$j;->i:Lo/d;

    .line 2
    .line 3
    iput p2, p0, Lo/d$j;->g:I

    .line 4
    .line 5
    iput-object p3, p0, Lo/d$j;->h:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lo/d$j;->i:Lo/d;

    .line 2
    .line 3
    iget v1, p0, Lo/d$j;->g:I

    .line 4
    .line 5
    iget-object v2, p0, Lo/d$j;->h:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lo/d;->S(ILjava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

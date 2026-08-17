.class public Lo/f$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Lo/f$c;

.field private final b:I


# direct methods
.method constructor <init>(Lo/f$c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo/f$b;->a:Lo/f$c;

    .line 5
    .line 6
    iput p2, p0, Lo/f$b;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lo/f$b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public b()Lo/f$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/f$b;->a:Lo/f$c;

    .line 2
    .line 3
    return-object v0
.end method

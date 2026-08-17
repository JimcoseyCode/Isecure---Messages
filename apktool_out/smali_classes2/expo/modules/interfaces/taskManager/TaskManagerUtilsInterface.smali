.class public interface abstract Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# virtual methods
.method public abstract cancelScheduledJob(Landroid/content/Context;I)V
.end method

.method public abstract cancelTaskIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract createTaskIntent(Landroid/content/Context;Lexpo/modules/interfaces/taskManager/TaskInterface;)Landroid/app/PendingIntent;
.end method

.method public abstract executeTask(Lexpo/modules/interfaces/taskManager/TaskInterface;Landroid/os/Bundle;Lexpo/modules/interfaces/taskManager/TaskExecutionCallback;)V
.end method

.method public abstract extractDataFromJobParams(Landroid/app/job/JobParameters;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/job/JobParameters;",
            ")",
            "Ljava/util/List<",
            "Landroid/os/PersistableBundle;",
            ">;"
        }
    .end annotation
.end method

.method public abstract scheduleJob(Landroid/content/Context;Lexpo/modules/interfaces/taskManager/TaskInterface;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lexpo/modules/interfaces/taskManager/TaskInterface;",
            "Ljava/util/List<",
            "Landroid/os/PersistableBundle;",
            ">;)V"
        }
    .end annotation
.end method
